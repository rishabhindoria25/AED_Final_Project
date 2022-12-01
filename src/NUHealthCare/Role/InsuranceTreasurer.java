package NUHealthCare.Role;

import NUHealthCare.Account.Account;
import NUHealthCare.Ecosystem;
import NUHealthCare.Enterprise.Enterprise;
import NUHealthCare.Org.Org;
import NUHealthCare.Org.InsurancePlannerOrg;
import NUHealthCare.Org.InsuranceTreasurerOrg;
import NUHealthCare.Account.Account;
import UI.InsuranceTreasurer.InsuranceTreasurerWorkArea;
import UI.InsurancePlanner.InsurancePlannerWorkArea;
import static NUHealthCare.Org.Org.Type.InsuranceTreasurer;
import javax.swing.JPanel;

/**
 *
 * @author Rishabh,Uday,Aditi
 */
public class InsuranceTreasurer extends Role {
  @Override
  public JPanel createWorkArea(JPanel userProcessContainer, Account account, Org org, Enterprise enterprise, Ecosystem business) {
    return new InsuranceTreasurerWorkArea(userProcessContainer, account, (InsuranceTreasurerOrg)org, enterprise);
  }
}
