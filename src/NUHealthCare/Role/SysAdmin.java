package NUHealthCare.Role;

import NUHealthCare.Ecosystem;
import NUHealthCare.Account.Account;
import NUHealthCare.Enterprise.Enterprise;
import NUHealthCare.Org.Org;
import UI.SysAdminWorkArea.SysAdminWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author Rishabh,Uday,Aditi
 */
public class SysAdmin extends Role {
  @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Account account, Org org, Enterprise enterprise, Ecosystem ecosystem) {
        return new SysAdminWorkArea(userProcessContainer, ecosystem);
    }
}
