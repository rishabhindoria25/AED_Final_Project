/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NUHealthCare.Org;

import NUHealthCare.Role.Accountant;
import NUHealthCare.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Rishabh,Uday,Aditi
 */
public class AccountantOrg extends Org{
    
    public AccountantOrg() {
        super(Org.Type.Accountant.getValue());

    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Accountant());
        return roles;
    }
    
}
