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
   }
   
   /**
   Constructor
   @param policyNum The policy number
   @param provname The name of the insurance provider
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
   
   //setters
   
   /**
   This method 
   */
   public void setPolicyNum(int policyNum)
   {
      policyNumber = policyNum;
   }
   
   public void setProviderName(String provName)
   {
      providerName = provName;
   }
   
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
   public int getPolicyNum()
   {
      return policyNumber;
   }
   
   public String getProviderName()
   {
      return providerName;
   }
   
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
   
   //calculate policyholder's BMI
   public double getBMI()
   {
      return (policyholderWeight * 703) / Math.pow(policyholderHeight, 2);
   }
   
   //calculate
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