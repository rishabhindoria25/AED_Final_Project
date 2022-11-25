package NUHealthCare.JobQueue;

import NUHealthCare.InsuranceCustomer.InsuranceCustomer;

/**
 *
 * @author Rishabh,Uday,Aditi
 */
public class InsuranceJob extends JobRequest {
  private String policyNumber;
  private String ssn;
  private String policyName;
  private String insuranceCompany;
  private double claimAmount;
  private String agent;
  private String financer;
  private double billAmount;
  private InsuranceCustomer insuranceCustomer;
  private String healthCenter;
  private String customerEmail;
  private String customerPhone;

  public String getPolicyNumber() {
    return policyNumber;
  }

  public void setPolicyNumber(String policyNumber) {
    this.policyNumber = policyNumber;
  }

  public String getSsn() {
    return ssn;
  }

  public void setSsn(String ssn) {
    this.ssn = ssn;
  }

  public String getPolicyName() {
    return policyName;
  }

  public void setPolicyName(String policyName) {
    this.policyName = policyName;
  }

  public String getInsuranceCompany() {
    return insuranceCompany;
  }

  public void setInsuranceCompany(String insuranceCompany) {
    this.insuranceCompany = insuranceCompany;
  }

  public double getClaimAmount() {
    return claimAmount;
  }

  public void setClaimAmount(double claimAmount) {
    this.claimAmount = claimAmount;
  }

  public String getAgent() {
    return agent;
  }

  public void setAgent(String agent) {
    this.agent = agent;
  }

  public String getFinancer() {
    return financer;
  }

  public void setFinancer(String financer) {
    this.financer = financer;
  }

  public double getBillAmount() {
    return billAmount;
  }

  public void setBillAmount(double billAmount) {
    this.billAmount = billAmount;
  }

  public InsuranceCustomer getInsuranceCustomer() {
    return insuranceCustomer;
  }

  public void setInsuranceCustomer(InsuranceCustomer insuranceCustomer) {
    this.insuranceCustomer = insuranceCustomer;
  }

  public String getHealthCenter() {
    return healthCenter;
  }

  public void setHealthCenter(String healthCenter) {
    this.healthCenter = healthCenter;
  }

  public String getCustomerEmail() {
    return customerEmail;
  }

  public void setCustomerEmail(String customerEmail) {
    this.customerEmail = customerEmail;
  }

  public String getCustomerPhone() {
    return customerPhone;
  }

  public void setCustomerPhone(String customerPhone) {
    this.customerPhone = customerPhone;
  }
  
  
}
