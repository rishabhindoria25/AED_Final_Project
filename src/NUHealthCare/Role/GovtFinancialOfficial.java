package NUHealthCare.Role;

import NUHealthCare.Account.Account;
import NUHealthCare.Ecosystem;
import NUHealthCare.Enterprise.Enterprise;
import NUHealthCare.Org.Org;
import NUHealthCare.Org.FinancialOfficialOrg;
import UI.GovtFinancialOfficial.FinancialOfficialWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author Rishabh,Uday,Aditi
 */
public class GovtFinancialOfficial extends Role {
  @Override
  public JPanel createWorkArea(JPanel userProcessContainer, Account userAccount, Org org, Enterprise enterprise, Ecosystem business) {
    return new FinancialOfficialWorkArea(userProcessContainer, userAccount, (FinancialOfficialOrg)org, enterprise);
  }
}
