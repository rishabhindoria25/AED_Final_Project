package NUHealthCare.Order;

/**
 *
 * @author Rishabh,Uday,Aditi
 */
public class ItemList {
  private String item;
  private double quantity;
  private double price;
  private double total;

  public String getItem() {
    return item;
  }

  public void setItem(String item) {
    this.item = item;
  }

  public double getQuantity() {
    return quantity;
  }

  public void setQuantity(double quantity) {
    this.quantity = quantity;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public double getTotal() {
    return total;
  }

  public void setTotal(double total) {
    this.total = total;
  }
  
  
  
  @Override
  public String toString() {
    return item;
  }
}
