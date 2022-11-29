/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NUHealthCare.Org;

import NUHealthCare.Role.InsuranceTreasurer;
import NUHealthCare.Role.Role;
import java.util.ArrayList;
        
/**
 *
 * @author Rishabh,Uday,Aditi
 */
public class InsuranceTreasurerOrg extends Org {
    
    public InsuranceTreasurerOrg() {
        super(Org.Type.InsuranceTreasurer.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new InsuranceTreasurer());
        return roles;
    }
    
}
