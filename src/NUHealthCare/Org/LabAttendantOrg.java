/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NUHealthCare.Org;
import NUHealthCare.Role.LabAttendant;
import NUHealthCare.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author Rishabh,Uday,Aditi
 */
public class LabAttendantOrg extends Org{
    public LabAttendantOrg() {
        super(Org.Type.Lab.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new LabAttendant());
        return roles;
    }
}
