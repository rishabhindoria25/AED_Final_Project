package NUHealthCare.Role;

import NUHealthCare.Account.Account;
import NUHealthCare.Ecosystem;
import NUHealthCare.Enterprise.Enterprise;
import NUHealthCare.Org.Org;
import NUHealthCare.Org.InsuranceAgentOrg;
import NUHealthCare.Org.FinancialOfficialOrg;
import NUHealthCare.Account.Account;
import UI.InsuranceAgent.InsuranceAgentWorkArea;
import UI.GovtFinancialOfficial.FinancialProcessRequestsJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Rishabh,Uday,Aditi
 */
public class InsuranceAgent extends Role {
  @Override
  public JPanel createWorkArea(JPanel userProcessContainer, Account account, Org org, Enterprise enterprise, Ecosystem business) {
    return new InsuranceAgentWorkArea(userProcessContainer, account, (InsuranceAgentOrg)org, enterprise);
  }
}
