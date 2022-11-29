/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NUHealthCare.Org;

import NUHealthCare.Role.GovtHealthOfficial;
import NUHealthCare.Role.GovtFinancialOfficial;
import NUHealthCare.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Rishabh,Uday,Aditi
 */
public class FinancialOfficialOrg extends Org{
     public FinancialOfficialOrg() {
        super(Org.Type.FinancialOfficial.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new GovtFinancialOfficial());
        return roles;
    }
}
