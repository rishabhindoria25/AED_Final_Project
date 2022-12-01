package NUHealthCare.Role;

import NUHealthCare.Account.Account;
import NUHealthCare.Ecosystem;
import NUHealthCare.Enterprise.Enterprise;
import NUHealthCare.Org.Org;
import NUHealthCare.Org.DoctorOrg;
import NUHealthCare.Org.HealthOfficialOrg;
import UI.HealthcareOfficial.HealthOfficialWorkArea;
import UI.DoctorRole.DoctorWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author Rishabh,Uday,Aditi
 */
public class GovtHealthOfficial  extends Role {
  @Override
  public JPanel createWorkArea(JPanel userProcessContainer, Account userAccount, Org org, Enterprise enterprise, Ecosystem business) {
    return new HealthOfficialWorkArea(userProcessContainer, userAccount, (HealthOfficialOrg)org, enterprise);
  }
}
