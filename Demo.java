import java.util.Scanner;

public class Demo
{
      int policyNumber;
      String providerName;
      String policyholderFirstName;
      String policyholderLastName;
      int policyholderAge;
      String policyholderSmokingStatus;
      double policyholderHeight;
      double policyholderWeight;

   public Demo()
   {
            
      createPolicy();
      
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
   
   public void createPolicy()
   {
      Scanner keyboard = new Scanner(System.in);
            
      System.out.print("Please enter the Policy Number: ");
      policyNumber = keyboard.nextInt();
      keyboard.nextLine();
      
      System.out.print("Please enter the Provider Name: ");
      providerName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's First Name: ");
      policyholderFirstName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Last Name: ");
      policyholderLastName = keyboard.nextLine();
            
      System.out.print("Please enter the Policyholder's Age: ");
      policyholderAge = keyboard.nextInt();
      keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      policyholderSmokingStatus = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Height (in inches): ");
      policyholderHeight = keyboard.nextDouble();
      keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Weight (in pounds): ");
      policyholderWeight = keyboard.nextDouble();
   }
}