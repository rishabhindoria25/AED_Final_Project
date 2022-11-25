/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NUHealthCare.Enterprise;

import NUHealthCare.Order.OrderDirectory;
import NUHealthCare.Org.Org;
import NUHealthCare.Role.Role;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Rishabh,Uday,Aditi
 */
public class PharmacyEnterprise extends Enterprise {

  private OrderDirectory orderDirectory;
  HashMap<String, Double> menu;

  public PharmacyEnterprise(String orgName, int zip, String address) {
    super(orgName, EnterpriseType.Pharmacy, zip, address);
    orderDirectory = new OrderDirectory();
    menu = new HashMap();
  }

  @Override
  public ArrayList<Role> getSupportedRole() {
    return null;
  }

  @Override
  public List<Org.Type> getAllOrganizationTypes() {
    List<Org.Type> orgTypes = new ArrayList<>();
    orgTypes.add(Org.Type.Transportation);
    orgTypes.add(Org.Type.Manager);

    return orgTypes;
  }

  public OrderDirectory getOrderDirectory() {
    return orderDirectory;
  }

  public void setOrderDirectory(OrderDirectory orderDirectory) {
    this.orderDirectory = orderDirectory;
  }

  public HashMap<String, Double> getMenu() {
    return menu;
  }

  public void setMenu(HashMap<String, Double> menu) {
    this.menu = menu;
  }
}
