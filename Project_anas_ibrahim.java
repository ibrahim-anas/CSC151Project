import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class Project_anas_ibrahim
{
   public static void main(String[] args) throws IOException
   {
      int policyNumber;
      String providerName;
      String policyholderFirstName;
      String policyholderLastName;
      int policyholderAge;
      String policyholderSmokingStatus;
      double policyholderHeight;
      double policyholderWeight;
      int totalIterations = 0;
      
      File policyInfo = new File("PolicyInformation.txt");
      
      Scanner input = new Scanner(policyInfo);
      
      ArrayList<Policy> policyList = new ArrayList<Policy>();
      
      while(input.hasNext()) 
      {
         Policy demoPolicy = new Policy();
         
         demoPolicy.setPolicyNum(input.nextInt());   
         input.nextLine();
         demoPolicy.setProviderName(input.nextLine());
         demoPolicy.setPolicyholderFirstName(input.nextLine());
         demoPolicy.setPolicyholderLastName(input.nextLine());
         demoPolicy.setPolicyholderAge(input.nextInt());
         input.nextLine();
         demoPolicy.setPolicyholderSmokingStatus(input.nextLine());
         demoPolicy.setPolicyholderHeight(input.nextDouble());
         demoPolicy.setPolicyholderWeight(input.nextDouble());
         
         policyList.add(demoPolicy);
      }
      
      input.close();
      
      for(int i = 0; i < policyList.size(); i++)
      {                                     
         System.out.println("\nPolicy Number: " + policyList.get(i).getPolicyNum());
         System.out.println("Provider Name: " + policyList.get(i).getProviderName());
         System.out.println("Policyholder's First Name: " + policyList.get(i).getPolicyholderFirstName());
         System.out.println("Policyholder's Last Name: " + policyList.get(i).getPolicyholderLastName());
         System.out.println("Policyholder's Age: " + policyList.get(i).getPolicyholderAge());
         System.out.println("Policyholder's Smoking Status: " + policyList.get(i).getPolicyholderSmokingStatus());
         System.out.printf("Policyholder's Height: %.1f inches", policyList.get(i).getPolicyholderHeight());
         System.out.printf("\nPolicyholder's Weight: %.1f pounds", policyList.get(i).getPolicyholderWeight());
         System.out.printf("\nPolicyholder's BMI: %.2f", policyList.get(i).getBMI());
         System.out.printf("\nPolicy Price: $%,.2f", policyList.get(i).getPolicyPrice());
         System.out.println();
      }
      
      int smokerCount = 0;
      int nonSmokerCount = 0;
      
      for(int i = 0; i < policyList.size(); i++)
      {
         if (policyList.get(i).getPolicyholderSmokingStatus().equalsIgnoreCase("smoker"))
            smokerCount++;
         else
            nonSmokerCount++;
      }
      
      System.out.println();
      System.out.println("The number of policies with a smoker is: " + smokerCount);
      System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);
   }
}