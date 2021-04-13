/**
This program will model an insurance policy for a single person.
*/

public class Policy
{
   //declare fields - declared as private to hide the internal data
   private int policyNumber;
   private String providerName;
   private PolicyHolder policyHolder;
   private static int numPolicyObjects = 0;
      
   //no-arg Constructor
   public Policy()
   {
      policyNumber = 0;
      providerName = "";
      policyHolder = null;

      numPolicyObjects++;
   }
   
   //constructor   
   public Policy(int policyNumber, String providerName, PolicyHolder policyHolder)
   {
      this.policyNumber = policyNumber;
      this.providerName = providerName;
      this.policyHolder = new PolicyHolder(policyHolder);
      
      numPolicyObjects++;
   }
   
   //setters
   public void setPolicyNumber(int policyNumber)
   {
      this.policyNumber = policyNumber;
   }
   
   public void setProviderName(String providerName)
   {
      this.providerName = providerName;
   }
   
   //getters
   public int getPolicyNumber()
   {
      return policyNumber;
   }
   
   public String getProviderName()
   {
      return providerName;
   }   
   
   public PolicyHolder getPolicyHolder()
   {
      return new PolicyHolder(policyHolder);
   }
      
   public int getNumPolicyObjects()
   {
      return numPolicyObjects;
   }
   
   //this method reruns the price of the policy
   public double getPolicyPrice()
   {
      //constants
      final double BASE_FEE = 600.0;
      final double OVER_50_YRS_OLD_FEE = 75.0;
      final double SMOKER_FEE = 100.0;
      final String SMOKER = "smoker";
      
      double bmi = policyHolder.getBMI();
      double bmiFee = (policyHolder.getBMI() - 35) * 20;
      double policyPrice = BASE_FEE;
      
      if(policyHolder.getPolicyholderAge() > 50)
         policyPrice += OVER_50_YRS_OLD_FEE;
      
      if(policyHolder.getPolicyholderSmokingStatus().equals(SMOKER))
         policyPrice += SMOKER_FEE;
          
      if(bmi > 35)
         policyPrice += bmiFee;
      
      return policyPrice;
   }

   public String toString()
   {
      String str = String.format("Policy Number: %d \nProvider Name: %s %s \nPolicy Price: $%,.2f\n", 
                                  policyNumber, providerName, policyHolder.toString(), getPolicyPrice());
      
      return str;
   }
}