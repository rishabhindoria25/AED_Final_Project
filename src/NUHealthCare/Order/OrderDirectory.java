package NUHealthCare.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Rishabh,Uday,Aditi
 */
public class OrderDirectory {
  private List<Order> orderList;

  public OrderDirectory() {
    orderList = new ArrayList<>();
  }

  public List<Order> getOrderList() {
    return orderList;
  }

  public void setOrderList(List<Order> orderList) {
    this.orderList = orderList;
  }
  
  public void addOrder(Order order) {
    Random randomID = new Random();
    order.setItemID("Order_no_"+String.valueOf(randomID.nextInt(100000)));
    this.orderList.add(order);
  }
  
}
