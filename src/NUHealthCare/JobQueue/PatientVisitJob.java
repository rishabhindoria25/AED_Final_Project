package NUHealthCare.JobQueue;

import NUHealthCare.Account.Account;
import NUHealthCare.Patient.Patient;

/**
 *
 * @author Rishabh,Uday,Aditi
 */
public class PatientVisitJob extends JobRequest{
  private String regDate;
  private String visitReason;
  private Patient patient;
  private String labTestType;
  private String labResult;
  private Account labAssistant;
  private String labTestMessage;
  private String prescription;
  private double billAmount;
  private Account assignedDoctor;
  private boolean isComplete;

  public PatientVisitJob(String regDate, String visitReason, Patient patient) {
    this.regDate = regDate;
    this.visitReason = visitReason;
    this.patient = patient;
  }

  public String getRegDate() {
    return regDate;
  }

  public void setRegDate(String regDate) {
    this.regDate = regDate;
  }

  public String getVisitReason() {
    return visitReason;
  }

  public void setVisitReason(String visitReason) {
    this.visitReason = visitReason;
  }

  public Patient getPatient() {
    return patient;
  }

  public void setPatient(Patient patient) {
    this.patient = patient;
  }

  public String getLabTestType() {
    return labTestType;
  }

  public void setLabTestType(String labTestType) {
    this.labTestType = labTestType;
  }

  public String getLabResult() {
    return labResult;
  }

  public void setLabResult(String labResult) {
    this.labResult = labResult;
  }

  public Account getLabAssistant() {
    return labAssistant;
  }

  public void setLabAssistant(Account labAssistant) {
    this.labAssistant = labAssistant;
  }

  public String getLabTestMessage() {
    return labTestMessage;
  }

  public void setLabTestMessage(String labTestMessage) {
    this.labTestMessage = labTestMessage;
  }

  public String getPrescription() {
    return prescription;
  }

  public void setPrescription(String prescription) {
    this.prescription = prescription;
  }

  public double getBillAmount() {
    return billAmount;
  }

  public void setBillAmount(double billAmount) {
    this.billAmount = billAmount;
  }

  public Account getAssignedDoctor() {
    return assignedDoctor;
  }

  public void setAssignedDoctor(Account assignedDoctor) {
    this.assignedDoctor = assignedDoctor;
  }

    public boolean getIsComplete() {
        return isComplete;
    }

  public void setIsComplete(boolean isComplete) {
    this.isComplete = isComplete;
  }
  
  @Override
  public String toString() {
    return visitReason;
  }
  
}
