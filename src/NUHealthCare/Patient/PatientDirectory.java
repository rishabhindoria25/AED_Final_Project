package NUHealthCare.Patient;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rishabh,Uday,Aditi
 */
public class PatientDirectory {
  private List<Patient> patientList;

  public PatientDirectory() {
    patientList = new ArrayList<>();
  }
  

  public List<Patient> getPatientList() {
    return patientList;
  }

  public void setPatientList(List<Patient> patientList) {
    this.patientList = patientList;
  }
  
}
