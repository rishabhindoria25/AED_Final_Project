package NUHealthCare.Account;

import NUHealthCare.Employee.Employee;
import NUHealthCare.Patient.Patient;
import NUHealthCare.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Rishabh,Uday,Aditi
 */
public class AccountDirectory {
  private ArrayList<Account> userAccountList;

  public AccountDirectory() {
    userAccountList = new ArrayList<>();
  }

  public ArrayList<Account> getUserAccountList() {
    return userAccountList;
  }
  
  // createUser - Employee
  public Account createUserAccount(String username, String password, Employee employee, Role role) {
    Account userAccount = new Account();
    userAccount.setUsername(username);
    userAccount.setPassword(password);
    userAccount.setEmployee(employee);
    userAccount.setRole(role);
    userAccountList.add(userAccount);
    return userAccount;
  }
  //createUser - Patient
  public Account createUserAccount(String username, String password, Patient customer, Role role) {
    Account userAccount = new Account();
    userAccount.setUsername(username);
    userAccount.setPassword(password);
    userAccount.setCustomer(customer);
    userAccount.setRole(role);
    userAccountList.add(userAccount);
    return userAccount;
  }
  // have unique username
  public boolean checkUniqueUsername(String username) {
    for(Account account: userAccountList) {
      if(account.getUsername().equals(username))
        return false;
    }
    return true;
  }
  
  // Authenticate User
  public Account authUser(String username, String password) {
    for(Account account: userAccountList) {
      if(account.getUsername().equals(username) && account.getPassword().equals(password))
        return account;
    }
    return null;
  }
  
}
