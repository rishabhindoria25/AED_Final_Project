package NUHealthCare.Role;

import NUHealthCare.Account.Account;
import NUHealthCare.Ecosystem;
import NUHealthCare.Enterprise.Enterprise;
import NUHealthCare.Org.Org;
import UI.AdminRole.EnterpriseAdminWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author Rishabh,Uday,Aditi
 */
public class EnterpriseAdmin extends Role {
  @Override
  public JPanel createWorkArea(JPanel userProcessContainer, Account account, Org org, Enterprise enterprise, Ecosystem ecosystem) {
   return new EnterpriseAdminWorkArea(userProcessContainer, enterprise, account,ecosystem);
  }
}
