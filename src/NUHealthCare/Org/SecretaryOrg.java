/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NUHealthCare.Org;

import NUHealthCare.Role.GovtHealthOfficial;
import NUHealthCare.Role.GovtSecretary;
import NUHealthCare.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Rishabh,Uday,Aditi
 */
public class SecretaryOrg extends Org{
    
     public SecretaryOrg() {
        super(Org.Type.Secretary.getValue());
    }
     
      @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new GovtSecretary());
        return roles;
    }
    
}
