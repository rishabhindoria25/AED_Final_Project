package NUHealthCare.JobQueue;

/**
 *
 * @author Rishabh,Uday,Aditi
 */
public class GovtFundJob extends JobRequest {
  private String location;
  private int population;
  private String adminName;
  private String adminEmail;
  private double requestAmount;

  public GovtFundJob(String location, int population, double requestAmount) {
    this.location = location;
    this.population = population;
    this.requestAmount = requestAmount;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public int getPopulation() {
    return population;
  }

  public void setPopulation(int population) {
    this.population = population;
  }

  public double getRequestAmount() {
    return requestAmount;
  }

  public void setRequestAmount(double requestAmount) {
    this.requestAmount = requestAmount;
  }

  public String getAdminName() {
    return adminName;
  }

  public void setAdminName(String adminName) {
    this.adminName = adminName;
  }

  public String getAdminEmail() {
    return adminEmail;
  }

  public void setAdminEmail(String adminEmail) {
    this.adminEmail = adminEmail;
  }
  
  @Override
  public String toString() {
    return location;
  }
}
