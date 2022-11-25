package NUHealthCare.Insurance;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rishabh,Uday,Aditi
 */
public class InsurancePlanDirectory {
  private List<Insurance> insurancePlansList;

  public InsurancePlanDirectory() {
    insurancePlansList = new ArrayList<>();
  }
  

  public List<Insurance> getInsurancePlans() {
    return insurancePlansList;
  }

  public void setInsurancePlans(List<Insurance> insurancePlans) {
    this.insurancePlansList = insurancePlans;
  }
  
}
