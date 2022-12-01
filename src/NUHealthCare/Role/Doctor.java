package NUHealthCare.Role;

import NUHealthCare.Account.Account;
import NUHealthCare.Ecosystem;
import NUHealthCare.Enterprise.Enterprise;
import NUHealthCare.Org.Org;
import NUHealthCare.Org.DoctorOrg;
import UI.DoctorRole.DoctorWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author Rishabh,Uday,Aditi
 */
public class Doctor extends Role {
  @Override
  public JPanel createWorkArea(JPanel userProcessContainer, Account userAccount, Org org, Enterprise enterprise, Ecosystem business) {
    return new DoctorWorkArea(userProcessContainer, userAccount, (DoctorOrg)org, enterprise);
  }
  
}
