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
      
      File policyInfo = new File("PolicyInformation.txt");
      
      Scanner input = new Scanner(policyInfo);
      
      ArrayList<Policy> policyList = new ArrayList<Policy>();
      
      while(input.hasNext()) 
      {
         policyNumber = input.nextInt();   
         input.nextLine();
         providerName = input.nextLine();
         policyholderFirstName = input.nextLine();
         policyholderLastName = input.nextLine();
         policyholderAge = input.nextInt();
         input.nextLine();
         policyholderSmokingStatus = input.nextLine();
         policyholderHeight = input.nextDouble();
         policyholderWeight = input.nextDouble();
                   
         policyList.add(new Policy(policyNumber, providerName, policyholderFirstName, policyholderLastName,
                                   policyholderAge, policyholderSmokingStatus, policyholderHeight, policyholderWeight));
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