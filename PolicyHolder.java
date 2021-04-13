public class PolicyHolder
{  
   //declare fields
   private String policyholderFirstName;
   private String policyholderLastName;
   private int policyholderAge;
   private String policyholderSmokingStatus;
   private double policyholderHeight;
   private double policyholderWeight;
   
   //no-arg constructor
   public PolicyHolder()
   {
      policyholderFirstName = "";
      policyholderLastName = "";
      policyholderAge = 0;
      policyholderSmokingStatus = "";
      policyholderHeight = 0;
      policyholderWeight = 0;
   }
   
   //constructor
   public PolicyHolder(String firstName, String lastName, int age,
                       String smokingStatus, double height, double weight)
   {
      policyholderFirstName = firstName;
      policyholderLastName = lastName;
      policyholderAge = age;
      policyholderSmokingStatus = smokingStatus;
      policyholderHeight = height;
      policyholderWeight = weight;
   }
   
   //copy constructor
   public PolicyHolder(PolicyHolder object2)
   {
      policyholderFirstName = object2.policyholderFirstName;
      policyholderLastName = object2.policyholderLastName;
      policyholderAge = object2.policyholderAge;
      policyholderSmokingStatus = object2.policyholderSmokingStatus;
      policyholderHeight = object2.policyholderHeight;
      policyholderWeight = object2.policyholderWeight;
   }
   
   //setters
   public void setPolicyholderFirstName(String firstName)
   {
      policyholderFirstName = firstName;
   }
   
   public void setPolicyholderLastName(String lastName)
   {
      policyholderLastName = lastName;
   }
   
   public void setPolicyholderAge(int age)
   {
      policyholderAge = age;
   }
   
   public void setPolicyholderSmokingStatus(String smokingStatus)
   {
      policyholderSmokingStatus = smokingStatus;
   }
   
   public void setPolicyholderHeight(double height)
   {
      policyholderHeight = height;
   }

   public void setPolicyholderWeight(double weight)
   {
      policyholderWeight = weight;
   }
   
   //getters
   public String getPolicyholderFirstName()
   {
      return policyholderFirstName;
   }
   
   public String getPolicyholderLastName()
   {
      return policyholderLastName;
   }
   
   public int getPolicyholderAge()
   {
      return policyholderAge;
   }
   
   public String getPolicyholderSmokingStatus()
   {
      return policyholderSmokingStatus;
   }
 
   public double getPolicyholderHeight()
   {
      return policyholderHeight;
   }
 
   public double getPolicyholderWeight()
   {
      return policyholderWeight;
   }
   
   //this method returns the policy holder's BMI
   public double getBMI()
   {
      return (policyholderWeight * 703) / Math.pow(policyholderHeight, 2);
   }
      
   public String toString()
   {
      String str = String.format("\nPolicyholder's First Name: %s \nPolicyholder's Last Name: %s" 
                                 + "\nPolicyholder's Age: %d \nPolicyholder's Smoking Status: %s" 
                                 + "\nPolicyholder's Height: %,.1f inches \nPolicyholder's Weight: %,.1f pounds \nPolicyholder's BMI: %,.2f", 
                                 policyholderFirstName, 
                                 policyholderLastName, 
                                 policyholderAge, 
                                 policyholderSmokingStatus,
                                 policyholderHeight, 
                                 policyholderWeight,
                                 getBMI());
      
      return str;
   }
}