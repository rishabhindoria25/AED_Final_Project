package NUHealthCare.Patient;

import NUHealthCare.Account.Account;
import NUHealthCare.InsuranceCustomer.InsuranceCustomer;

/**
 *
 * @author Rishabh,Uday,Aditi
 */
public class Patient {
  private String patientID;
  private String patientLName;
  private String patientFName;
  private String SSN;
  private String age;
  private String phoneNumber;
  private String address;
  private String gender;
  private boolean isTreatmentDone;
  private String appointmentDate;
  private String patientEmail;
  private Account userAccount;
  
  private InsuranceCustomer insuranceCustomer;

  public String getPatientID() {
    return patientID;
  }

  public void setPatientID(String patientID) {
    this.patientID = patientID;
  }

  public String getPatientLName() {
    return patientLName;
  }

  public void setPatientLName(String patientLName) {
    this.patientLName = patientLName;
  }

  public String getPatientFName() {
    return patientFName;
  }

  public void setPatientFName(String patientFName) {
    this.patientFName = patientFName;
  }

  public String getSSN() {
    return SSN;
  }

  public void setSSN(String SSN) {
    this.SSN = SSN;
  }

  public String getAge() {
    return age;
  }

  public void setAge(String age) {
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

  public boolean isIsTreatmentDone() {
    return isTreatmentDone;
  }

  public void setIsTreatmentDone(boolean isTreatmentDone) {
    this.isTreatmentDone = isTreatmentDone;
  }

  public String getAppointmentDate() {
    return appointmentDate;
  }

  public void setAppointmentDate(String appointmentDate) {
    this.appointmentDate = appointmentDate;
  }

  public String getPatientEmail() {
    return patientEmail;
  }

  public void setPatientEmail(String patientEmail) {
    this.patientEmail = patientEmail;
  }
  
  public InsuranceCustomer getInsuranceCustomer() {
    return insuranceCustomer;
  }

  public void setInsuranceCustomer(InsuranceCustomer insuranceCustomer) {
    this.insuranceCustomer = insuranceCustomer;
  }

  public Account getUserAccount() {
    return userAccount;
  }

  public void setUserAccount(Account userAccount) {
    this.userAccount = userAccount;
  }
  
  @Override
  public String toString() {
    return String.valueOf(patientID);
  }

}
