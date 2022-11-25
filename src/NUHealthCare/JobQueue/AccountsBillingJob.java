package NUHealthCare.JobQueue;

import NUHealthCare.Patient.Patient;

/**
 *
 * @author Rishabh,Uday,Aditi
 */
public class AccountsBillingJob extends JobRequest {
  private double billingAmt;
  private boolean hasInsurance;
  private boolean isInsuranceClaimSettled;
  private PatientVisitJob visitRequest;
  Patient patient;

  public double getBillingAmt() {
    return billingAmt;
  }

  public void setBillingAmt(double billingAmt) {
    this.billingAmt = billingAmt;
  }

  public boolean isHasInsurance() {
    return hasInsurance;
  }

  public void setHasInsurance(boolean hasInsurance) {
    this.hasInsurance = hasInsurance;
  }

  public boolean isIsInsuranceClaimSettled() {
    return isInsuranceClaimSettled;
  }

  public void setIsInsuranceClaimSettled(boolean isInsuranceClaimSettled) {
    this.isInsuranceClaimSettled = isInsuranceClaimSettled;
  }

  public PatientVisitJob getVisitRequest() {
    return visitRequest;
  }

  public void setVisitRequest(PatientVisitJob visitRequest) {
    this.visitRequest = visitRequest;
  }

  public Patient getPatient() {
    return patient;
  }

  public void setPatient(Patient patient) {
    this.patient = patient;
  }
  
  @Override
  public String toString() {
    return String.valueOf(billingAmt);
  }
}
