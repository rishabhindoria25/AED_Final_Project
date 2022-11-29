package NUHealthCare.Order;

import NUHealthCare.Account.Account;
import NUHealthCare.Patient.Patient;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rishabh,Uday,Aditi
 */
public class Order {
  private String item;
  private String itemID;
  private Patient customer;
  private Account customerRole;
  private Account deliveryRole;
  private double amount;
  List<ItemList> itemList;

  public Order() {
    itemList = new ArrayList<>();
  }

  public String getItem() {
    return item;
  }

  public void setItem(String item) {
    this.item = item;
  }

  public String getItemID() {
    return itemID;
  }

  public void setItemID(String number) {
    this.itemID = itemID;
  }

  public Patient getCustomer() {
    return customer;
  }

  public void setCustomer(Patient customer) {
    this.customer = customer;
  }

  public Account getCustomerRole() {
    return customerRole;
  }

  public void setCustomerRole(Account customerRole) {
    this.customerRole = customerRole;
  }

  public Account getDeliveryRole() {
    return deliveryRole;
  }

  public void setDeliveryRole(Account deliveryRole) {
    this.deliveryRole = deliveryRole;
  }

  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

  public List<ItemList> getItemList() {
    return itemList;
  }

  public void setItemList(List<ItemList> itemList) {
    this.itemList = itemList;
  }
  
  @Override
  public String toString() {
    return itemID;
  }
}
