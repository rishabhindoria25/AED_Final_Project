package NUHealthCare.InsuranceCustomer;

import NUHealthCare.Insurance.Insurance;

/**
 *
 * @author Rishabh,Uday,Aditi
 */
public class InsuranceCustomer {
  private String customerFName;
  private String customerLName;
  private String SSN;
  private String DOB;
  private int age;
  private String phoneNumber;
  private String address;
  private String gender;
  private String planStartDate;
  private String planEndDate;
  private Insurance insurance;
  private String insurancePlanNumber;

  public InsuranceCustomer(Insurance insurance, String insurancePlanNumber) {
    this.insurance = insurance;
    this.insurancePlanNumber = insurancePlanNumber;
  }

  public String getCustomerFName() {
    return customerFName;
  }

  public void setCustomerFName(String customerFName) {
    this.customerFName = customerFName;
  }

  public String getCustomerLName() {
    return customerLName;
  }

  public void setCustomerLName(String customerLName) {
    this.customerLName = customerLName;
  }

  public String getSSN() {
    return SSN;
  }

  public void setSSN(String SSN) {
    this.SSN = SSN;
  }

  public String getDOB() {
    return DOB;
  }

  public void setDOB(String DOB) {
    this.DOB = DOB;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getPlanStartDate() {
    return planStartDate;
  }

  public void setPlanStartDate(String planStartDate) {
    this.planStartDate = planStartDate;
  }

  public String getPlanEndDate() {
    return planEndDate;
  }

  public void setPlanEndDate(String planEndDate) {
    this.planEndDate = planEndDate;
  }

  public Insurance getInsurance() {
    return insurance;
  }

  public void setInsurance(Insurance insurance) {
    this.insurance = insurance;
  }

  public String getInsurancePlanNumber() {
    return insurancePlanNumber;
  }

  public void setInsurancePlanNumber(String insurancePlanNumber) {
    this.insurancePlanNumber = insurancePlanNumber;
  }
  
  @Override
  public String toString() {
    return insurancePlanNumber;
  }
}
