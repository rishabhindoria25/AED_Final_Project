package NUHealthCare.Role;

import NUHealthCare.Account.Account;
import NUHealthCare.Ecosystem;
import NUHealthCare.Enterprise.Enterprise;
import NUHealthCare.Org.Org;
import NUHealthCare.Org.TransportOrg;
import NUHealthCare.Account.Account;
import UI.PharmacyTransportation.TransportationWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author Rishabh,Uday,Aditi
 */
public class Transportation extends Role {
  @Override
  public JPanel createWorkArea(JPanel userProcessContainer, Account account, Org org, Enterprise enterprise, Ecosystem ecosystem) {
    return new TransportationWorkArea(userProcessContainer, account, (TransportOrg) org, enterprise);
  }
}
