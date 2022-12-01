/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NUHealthCare.Role;

import javax.swing.JPanel;
import NUHealthCare.Enterprise.Enterprise;
import NUHealthCare.Org.Org;
import NUHealthCare.Account.Account;
import NUHealthCare.Ecosystem;

/**
 *
 * @author Rishabh,Uday,Aditi
 */
public abstract class Role {

  public enum RoleType {
    Admin("Admin"),
    Doctor("Doctor"),
    LabAssistant("Lab Assistant"),
    Patient("Patient"),
    Accountant("Accountant"),
    InsuranceAgent("Insurance Agent"),
    InsurancePlanner("Insurance Planner"),
    InsuranceTreasurer("Insurance Treasurer"),
    GovernmentHealthOfficial("Government Health Official"),
    GovernmentFinancialOfficial("Government Financial Official"),
    GovernmentSecretary("Government Secretary"),
    PharmaTransport("Pharmacy Transport"),
    PharmaManager("Pharmacy Manager");

    private String value;

    private RoleType(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return value;
    }
  }

  public abstract JPanel createWorkArea(JPanel userProcessContainer,
      Account account, Org org, Enterprise enterprise, Ecosystem ecosystem);

  @Override
  public String toString() {
    return this.getClass().
        getName().
        toString().
        split("NUHealthCare.Role.")[1];
  }

}
