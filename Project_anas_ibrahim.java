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
      
      ArrayList<PolicyHolder> policyHolderList = new ArrayList<PolicyHolder>();
      
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
         
         PolicyHolder demoPolicyHolder = new PolicyHolder(policyholderFirstName, policyholderLastName, policyholderAge,
                                                          policyholderSmokingStatus, policyholderHeight, policyholderWeight);
                                                          
         Policy demoPolicy = new Policy(policyNumber, providerName, demoPolicyHolder);
                  
         System.out.println(demoPolicy);
                  
         policyHolderList.add(demoPolicyHolder);
         
         policyList.add(demoPolicy);
         
      }
      
      input.close();
     
      int smokerCount = 0;
      int nonSmokerCount = 0;
      
      for(int i = 0; i < policyHolderList.size(); i++)
      {
         if (policyHolderList.get(i).getPolicyholderSmokingStatus().equalsIgnoreCase("smoker"))
            smokerCount++;
         else
            nonSmokerCount++;
      }
      
      System.out.println("There were " + policyList.get(0).getNumPolicyObjects() + " Policy objects created.");
      System.out.println("The number of policies with a smoker is: " + smokerCount);
      System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);
   }
}