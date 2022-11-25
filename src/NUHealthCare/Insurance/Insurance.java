package NUHealthCare.Insurance;

/**
 *
 * @author Rishabh,Uday,Aditi
 */
public class Insurance {
  private String planName;
  private String insuranceCompany;
  private double reimbursement;
  private String terms;
  private double monthlyPremium;

  public Insurance(String planName, String insuranceCompany,
    double reimbursement) {
    this.planName = planName;
    this.insuranceCompany = insuranceCompany;
    this.reimbursement = reimbursement;
  }

  public String getPlanName() {
    return planName;
  }

  public void setPlanName(String planName) {
    this.planName = planName;
  }

  public String getInsuranceCompany() {
    return insuranceCompany;
  }

  public void setInsuranceCompany(String insuranceCompany) {
    this.insuranceCompany = insuranceCompany;
  }

  public double getReimbursement() {
    return reimbursement;
  }

  public void setReimbursement(double reimbursement) {
    this.reimbursement = reimbursement;
  }

  public String getTerms() {
    return terms;
  }

  public void setTerms(String terms) {
    this.terms = terms;
  }

  public double getMonthlyPremium() {
    return monthlyPremium;
  }

  public void setMonthlyPremium(double monthlyPremium) {
    this.monthlyPremium = monthlyPremium;
  }
  
  @Override
  public String toString() {
    return planName;
  }
  
}
