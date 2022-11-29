/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NUHealthCare.Org;

import NUHealthCare.Employee.EmployeeDirectory;
import NUHealthCare.JobQueue.JobQueue;
import NUHealthCare.Account.AccountDirectory;
import NUHealthCare.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Rishabh,Uday,Aditi
 */
public abstract class Org {

  private String orgName;
  private JobQueue jobQueue;
  private EmployeeDirectory employeeDirectory;
  private AccountDirectory userAccountDirectory;
  private int orgID;
  private static int count = 0;

  public enum Type {

    //HealthCare Organization Types:
    Admin("Admin Organization"),
    Doctor("Doctor Organization"),
    Lab("Lab Organization"),
    Patient("Patient Organization"),
    Accountant("Accountant Organization"),
    
    //Insurance Organization Types:
    InsuranceAgent("Insurance Agent Organization"),
    InsurancePlanner("Insurance Planner Organization"),
    InsuranceTreasurer("Insurance Treasurer Organization"),
    
    //Government Organization Types
    FinancialOfficial("Financial Official Organization"),
    Secretary("Secretary Organization"),
    HealthOfficial("Healthcare Official Organization"),
    
    //Pharmacy Organization Types
    Transportation("Transportation Organization"),
    Manager("Manager Organization");

    private String value;

    private Type(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }
  }

  public Org(String orgName) {
    this.orgName = orgName;
    jobQueue = new JobQueue();
    employeeDirectory = new EmployeeDirectory();
    userAccountDirectory = new AccountDirectory();
    orgID = count;
    count++;
  }

  public String getOrgName() {
    return orgName;
  }

  public void setOrgName(String orgName) {
    this.orgName = orgName;
  }

  public JobQueue getJobQueue() {
    return jobQueue;
  }

  public void setJobQueue(JobQueue jobQueue) {
    this.jobQueue = jobQueue;
  }

  public EmployeeDirectory getEmployeeDirectory() {
    return employeeDirectory;
  }

  public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
    this.employeeDirectory = employeeDirectory;
  }

  public AccountDirectory getUserAccountDirectory() {
    return userAccountDirectory;
  }

  public void setUserAccountDirectory(AccountDirectory userAccountDirectory) {
    this.userAccountDirectory = userAccountDirectory;
  }

  public int getOrgID() {
    return orgID;
  }

  public void setOrgID(int orgID) {
    this.orgID = orgID;
  }

  public static int getCount() {
    return count;
  }

  public static void setCounter(int counter) {
    Org.count = counter;
  }

  public abstract ArrayList<Role> getSupportedRole();

  @Override
  public String toString() {
    return orgName;
  }
}
