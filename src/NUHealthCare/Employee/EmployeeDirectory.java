package NUHealthCare.Employee;

import java.util.ArrayList;

/**
 *
 * @author Rishabh,Uday,Aditi
 */
public class EmployeeDirectory {
  private ArrayList<Employee> empList;

  public EmployeeDirectory() {
    empList = new ArrayList<>();
  }
 public ArrayList<Employee> getEmpList() {
        return empList;
    }
  public Employee createEmployee(String name) {
    Employee emp = new Employee();
    emp.setEmpName(name);
    empList.add(emp);
    return emp;
  }
  
}
