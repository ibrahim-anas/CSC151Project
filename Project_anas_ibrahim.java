import java.util.Scanner;
import java.io.*;

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
      
      Scanner output = new Scanner(policyInfo);
            
      policyNumber = output.nextInt();   
      output.nextLine();
      providerName = output.nextLine();
      policyholderFirstName = output.nextLine();
      policyholderLastName = output.nextLine();
      policyholderAge = output.nextInt();
      output.nextLine();
      policyholderSmokingStatus = output.nextLine();
      policyholderHeight = output.nextDouble();
      policyholderWeight = output.nextDouble();
      
      output.close();
      
      Policy demoPolicy = new Policy(policyNumber, providerName, policyholderFirstName, policyholderLastName, policyholderAge, 
                                     policyholderSmokingStatus, policyholderHeight, policyholderWeight);
                                     
      System.out.println("\nPolicy Number: " + demoPolicy.getPolicyNum());
      System.out.println("Provider Name: " + demoPolicy.getProviderName());
      System.out.println("Policyholder's First Name: " + demoPolicy.getPolicyholderFirstName());
      System.out.println("Policyholder's Last Name: " + demoPolicy.getPolicyholderLastName());
      System.out.println("Policyholder's Age: " + demoPolicy.getPolicyholderAge());
      System.out.println("Policyholder's Smoking Status: " + demoPolicy.getPolicyholderSmokingStatus());
      System.out.printf("Policyholder's Height: %.1f inches", demoPolicy.getPolicyholderHeight());
      System.out.printf("\nPolicyholder's Weight: %.1f pounds", demoPolicy.getPolicyholderWeight());
      System.out.printf("\nPolicyholder's BMI: %.2f", demoPolicy.getBMI());
      System.out.printf("\nPolicy Price: $%,.2f", demoPolicy.getPolicyPrice());
   }
}