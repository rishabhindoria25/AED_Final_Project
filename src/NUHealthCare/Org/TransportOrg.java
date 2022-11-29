/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NUHealthCare.Org;

import java.util.ArrayList;
import NUHealthCare.Role.Accountant;
import NUHealthCare.Role.Role;
import NUHealthCare.Role.Transportation;


/**
 *
 * @author Rishabh,Uday,Aditi
 */
public class TransportOrg extends Org{
     public TransportOrg() {
        super(Org.Type.Transportation.getValue());

    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Transportation());
        return roles;
    }

}
