/**
This program will model an insurance policy for a single person.
*/

public class Policy
{
   //declare fields - declared as private to hide the internal data
   private int policyNumber;
   private String providerName;
   private String policyholderFirstName;
   private String policyholderLastName;
   private int policyholderAge;
   private String policyholderSmokingStatus;
   private double policyholderHeight;
   private double policyholderWeight;
   
   /**
   no-arg Constructor
   */
   
   public Policy()
   {
      policyNumber = 0;
      providerName = "";
      policyholderFirstName = "";
      policyholderLastName = "";
      policyholderAge = 0;
      policyholderSmokingStatus = "";
      policyholderHeight = 0;
      policyholderWeight = 0;
   }
   
   /**
   Constructor
   @param policyNum The policy number
   @param provName The name of the insurance provider
   @param firstName The policyholder's first name
   @param lastName The policyholder's last name
   @param age The policyholder's age
   @param smokingStatus The policyholder's smoking status (smoker or non-smoker)
   @param height The policyholder's height (in inches)
   @param weight The policyholder's weight (in pounds)
   */
   
   public Policy(int policyNum, String provName, String firstName, String lastName, 
                 int age, String smokingStatus, double height, double weight)
   {
      policyNumber = policyNum;
      providerName = provName;
      policyholderFirstName = firstName;
      policyholderLastName = lastName;
      policyholderAge = age;
      policyholderSmokingStatus = smokingStatus;
      policyholderHeight = height;
      policyholderWeight = weight;
   }
   
   /**
   This method sets the policy number
   @param policyNum The policy number
   */
   public void setPolicyNum(int policyNum)
   {
      policyNumber = policyNum;
   }
   
   /**
   This method sets the name of the insurance provider
   @param provName The name of the insurance provider
   */
   public void setProviderName(String provName)
   {
      providerName = provName;
   }
   
   /**
   This method sets the policyholder's first name
   @param firtsName The policyholder's first name
   */
   public void setPolicyholderFirstName(String firstName)
   {
      policyholderFirstName = firstName;
   }
   
   /**
   This method sets the policyholder's last name
   @param lastName The policyholder's last name
   */
   public void setPolicyholderLastName(String lastName)
   {
      policyholderLastName = lastName;
   }
   
   /**
   This method sets the policyholder's age
   @param age The policyholder's age
   */
   public void setPolicyholderAge(int age)
   {
      policyholderAge = age;
   }
   
   /**
   This method sets the policyholder's smoking status
   @param smokingStatus The policyholder's smoking status
   */
   public void setPolicyholderSmokingStatus(String smokingStatus)
   {
      policyholderSmokingStatus = smokingStatus;
   }
   
   /**
   This method sets the policyholder's height
   @param height The policyholder's height
   */
   public void setPolicyholderHeight(double height)
   {
      policyholderHeight = height;
   }
   
   /**
   This method sets the policyholder's weight
   @param weight The policyholder's weight
   */
   public void setPolicyholderWeight(double weight)
   {
      policyholderWeight = weight;
   }

   /**
   This method returns the policy number
   @return The policy number
   */
   public int getPolicyNum()
   {
      return policyNumber;
   }
   
   /**
   This method returns the name of the insurance provider
   @return The name of the insurance provider 
   */
   public String getProviderName()
   {
      return providerName;
   }
   
   /**
   This method returns the policyholder's first name
   @return The policyholder's first name
   */
   public String getPolicyholderFirstName()
   {
      return policyholderFirstName;
   }
   
   /**
   This method returns the policyholder's last name
   @return The policyholder's last name
   */
   public String getPolicyholderLastName()
   {
      return policyholderLastName;
   }
   
   /**
   This method returns the policyholder's age
   @return The policyholder's age
   */
   public int getPolicyholderAge()
   {
      return policyholderAge;
   }
   
   /**
   This method returns the policyholder's smoking status
   @return The policyholder's smoking status
   */
   public String getPolicyholderSmokingStatus()
   {
      return policyholderSmokingStatus;
   }
   
   /**
   This method returns the policyholder's height
   @return The policyholder's height
   */
   public double getPolicyholderHeight()
   {
      return policyholderHeight;
   }
   
   /**
   This method returns the policyholder's weight
   @return The policyholder's weight
   */
   public double getPolicyholderWeight()
   {
      return policyholderWeight;
   }
   
   /**
   This method returns the calculation of policyholder's BMI
   @return The policyholder's BMI
   */
   public double getBMI()
   {
      return (policyholderWeight * 703) / Math.pow(policyholderHeight, 2);
   }
   
   /**
   This method returns the price of the insurance policy
   @return The price of the insurance policy
   */
   public double getPolicyPrice()
   {
      final double BASE_FEE = 600.0;
      final double OVER_50_YRS_OLD_FEE = 75.0;
      final double SMOKER_FEE = 100.0;
      final String SMOKER = "smoker";
      
      double bmi = getBMI();
      
      if(policyholderAge > 50 && policyholderSmokingStatus.equals(SMOKER) && bmi > 35)
      {
         return BASE_FEE + OVER_50_YRS_OLD_FEE + SMOKER_FEE + ((bmi - 35) * 20);
      }
      else if(policyholderAge > 50 && policyholderSmokingStatus.equals(SMOKER))
      {
         return BASE_FEE + OVER_50_YRS_OLD_FEE + SMOKER_FEE;
      }
      else if(policyholderAge > 50 && bmi > 35)
      {
         return BASE_FEE + OVER_50_YRS_OLD_FEE + ((bmi - 35) * 20);
      }
      else if(policyholderSmokingStatus.equals(SMOKER) && bmi > 35)
      {
         return BASE_FEE + SMOKER_FEE + ((bmi - 35) * 20);
      }
      else if(policyholderAge > 50)
      {
         return BASE_FEE + OVER_50_YRS_OLD_FEE;
      }
      else if(policyholderSmokingStatus.equals(SMOKER))
      {
         return BASE_FEE + SMOKER_FEE;
      }
      else if(bmi > 35)
      {
         return BASE_FEE + ((bmi - 35) * 20);
      }
      else 
      {
         return BASE_FEE;
      }
   }
}