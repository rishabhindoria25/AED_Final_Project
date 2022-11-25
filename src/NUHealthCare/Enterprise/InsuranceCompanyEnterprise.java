/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NUHealthCare.Enterprise;

import NUHealthCare.Org.Org;
import NUHealthCare.Role.Role;
import NUHealthCare.Insurance.InsurancePlanDirectory;
import NUHealthCare.InsuranceCustomer.InsuranceCustomerDirectory;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rishabh,Uday,Aditi
 */
public class InsuranceCompanyEnterprise extends Enterprise {

  private InsuranceCustomerDirectory insuranceCustomerDirectory;

  private InsurancePlanDirectory insurancePlanDirectory;

  public InsuranceCompanyEnterprise(String orgName, int zip, String address) {
    super(orgName, EnterpriseType.InsuranceCompany, zip, address);
    insuranceCustomerDirectory = new InsuranceCustomerDirectory();
    insurancePlanDirectory = new InsurancePlanDirectory();

  }

  @Override
  public ArrayList<Role> getSupportedRole() {
    return null;
  }

  @Override
  public List<Org.Type> getAllOrganizationTypes() {
    List<Org.Type> orgTypes = new ArrayList<>();
    orgTypes.add(Org.Type.InsuranceAgent);
    orgTypes.add(Org.Type.InsurancePlanner);
    orgTypes.add(Org.Type.InsuranceTreasurer);

    return orgTypes;
  }

  public InsuranceCustomerDirectory getInsuranceCustomerDirectory() {
    return insuranceCustomerDirectory;
  }

  public void setInsuranceCustomerDirectory(
      InsuranceCustomerDirectory insuranceCustomerDirectory) {
    this.insuranceCustomerDirectory = insuranceCustomerDirectory;
  }

  public InsurancePlanDirectory getInsurancePlanDirectory() {
    return insurancePlanDirectory;
  }

  public void setInsurancePolicyDirectory(
      InsurancePlanDirectory insurancePolicyDirectory) {
    this.insurancePlanDirectory = insurancePolicyDirectory;
  }

}
