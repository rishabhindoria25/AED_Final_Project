package NUHealthCare.Employee;

/**
 *
 * @author Rishabh,Uday,Aditi
 */
public class Employee {

    private String empName;
    private int empID;
    private int empCount = 1;
    private String empEmail;

    public Employee() {
        empID = empCount;
        empCount++;
        this.empEmail = "indoria.rishabh9@gmail.com";
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public int getCount() {
        return empCount;
    }

    public void setCount(int count) {
        this.empCount = count;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    @Override
    public String toString() {
        return empName;
    }
}
