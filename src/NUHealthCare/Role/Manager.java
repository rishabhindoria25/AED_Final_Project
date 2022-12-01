package NUHealthCare.Role;

import NUHealthCare.Account.Account;
import NUHealthCare.Ecosystem;
import NUHealthCare.Enterprise.Enterprise;
import NUHealthCare.Org.Org;
import NUHealthCare.Org.ManagerOrg;
import UI.PharmacyManager.ManagerWorkArea;
import UI.PharmacyManager.ManageMenu;
import javax.swing.JPanel;

/**
 *
 * @author Rishabh,Uday,Aditi
 */
public class Manager extends Role {
  @Override
  public JPanel createWorkArea(JPanel userProcessContainer, Account account, Org org, Enterprise enterprise, Ecosystem ecosystem) {
    return new ManagerWorkArea(userProcessContainer, account,(ManagerOrg)org, enterprise);
  }
}
