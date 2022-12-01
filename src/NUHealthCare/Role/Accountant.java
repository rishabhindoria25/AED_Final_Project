package NUHealthCare.Role;

import NUHealthCare.Account.Account;
import NUHealthCare.Ecosystem;
import NUHealthCare.Enterprise.Enterprise;
import NUHealthCare.Org.Org;
import NUHealthCare.Org.AccountantOrg;
import UI.HealthcareAccountant.AccountantWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author Rishabh,Uday,Aditi
 */
public class Accountant extends Role {
  @Override
  public JPanel createWorkArea(JPanel userProcessContainer, Account account, Org org, Enterprise enterprise, Ecosystem ecosystem) {
    return new AccountantWorkArea(userProcessContainer, account, (AccountantOrg)org, enterprise, ecosystem);
  }
}
