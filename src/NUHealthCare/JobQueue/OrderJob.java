package NUHealthCare.JobQueue;

import NUHealthCare.Account.Account;
import NUHealthCare.Order.Order;

/**
 *
 * @author Rishabh,Uday,Aditi
 */
public class OrderJob extends JobRequest {
  private String regDate;
  private String visitReason;
  private Account hospitalAdmin;
  private String orderMsg;
  private double billAmt;
  private Account assignedTransport;
  private Order order;

  public OrderJob(String regDate, String visitReason) {
    this.regDate = regDate;
    this.visitReason = visitReason;
  }

    public OrderJob() {
         
    }

  public String getRegDate() {
    return regDate;
  }

  public void setRegDate(String regDate) {
    this.regDate = regDate;
  }

  public String getVisitReason() {
    return visitReason;
  }

  public void setVisitReason(String visitReason) {
    this.visitReason = visitReason;
  }

  public Account getHospitalAdmin() {
    return hospitalAdmin;
  }

  public void setHospitalAdmin(Account hospitalAdmin) {
    this.hospitalAdmin = hospitalAdmin;
  }

  public String getOrderMsg() {
    return orderMsg;
  }

  public void setOrderMsg(String orderMsg) {
    this.orderMsg = orderMsg;
  }

  public double getBillAmt() {
    return billAmt;
  }

  public void setBillAmt(double billAmt) {
    this.billAmt = billAmt;
  }

  public Account getAssignedTransport() {
    return assignedTransport;
  }

  public void setAssignedTransport(Account assignedTransport) {
    this.assignedTransport = assignedTransport;
  }

  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }
  
 @Override
 public String toString() {
   return orderMsg;
 }
}
