/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NUHealthCare.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author Rishabh,Uday,Aditi
 */
public class EnterpriseDirectory {

  private ArrayList<Enterprise> enterpriseList;

  public ArrayList<Enterprise> getEnterpriseList() {
    return enterpriseList;
  }

  public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
    this.enterpriseList = enterpriseList;
  }

  public EnterpriseDirectory() {
    enterpriseList = new ArrayList<>();
  }

  //Create enterprise
  public Enterprise createAndAddEnterprise(String name,
      Enterprise.EnterpriseType type, int zip, String address) {
    Enterprise enterprise = null;
    if (null != type) switch (type) {
      case HealthCare:
        enterprise = new HealthCareEnterprise(name, zip, address);
        enterpriseList.add(enterprise);
        break;
      case Government:
        enterprise = new GovtEnterprise(name, zip, address);
        enterpriseList.add(enterprise);
        break;
      case InsuranceCompany:
        enterprise = new InsuranceCompanyEnterprise(name, zip, address);
        enterpriseList.add(enterprise);
        break;
      case Pharmacy:
        enterprise = new PharmacyEnterprise(name, zip, address);
        enterpriseList.add(enterprise);
        break;
      default:
        break;
    }
    return enterprise;
  }
}
