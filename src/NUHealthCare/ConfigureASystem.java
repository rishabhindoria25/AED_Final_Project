package NUHealthCare;

import NUHealthCare.Account.Account;
import NUHealthCare.Employee.Employee;
import NUHealthCare.Enterprise.Enterprise;
import NUHealthCare.NetworkSystem.NetworkSystem;
import NUHealthCare.Role.EnterpriseAdmin;
import NUHealthCare.Role.SysAdmin;

/**
 *
 * @author Rishabh,Uday,Aditi
 */
public class ConfigureASystem {

    public static Ecosystem configure() {
        Ecosystem ecosystem = Ecosystem.getInstanceOf();

        String email = "indoria.rishabh9@gmail.com";

        // NetworkSystem
        NetworkSystem ns1 = ecosystem.createAndAddSystem();
        ns1.setName("New Jersey");
        ns1.setZipcode(1111);

        NetworkSystem ns2 = ecosystem.createAndAddSystem();
        ns2.setName("Boston");
        ns2.setZipcode(1112);

        NetworkSystem ns3 = ecosystem.createAndAddSystem();
        ns3.setName("New York");
        ns3.setZipcode(1113);

        // Enterprise
        for (Enterprise.EnterpriseType type : Enterprise.EnterpriseType.values()) {
            if (type.toString() != null) {
                switch (type.toString()) {
                    case "HealthCare":
                        // Cancer center enterprise
                        Enterprise e1 = ns1.getEnterpriseDirectory().createAndAddEnterprise("NJHealth", type, 1111, "745 Secaucus Rd, Jersey City, NJ 07307");
                        Enterprise e2 = ns2.getEnterpriseDirectory().createAndAddEnterprise("BostonHealth", type, 1112, "104 Ward Street, Boston, MA 02120");
                        Enterprise e3 = ns3.getEnterpriseDirectory().createAndAddEnterprise("NYHealth", type, 1113, "575 Hudson St, New York, NY 10014");

                        // Cancer center employees
                        Employee emp1 = e1.getEmployeeDirectory().createEmployee("NJHealth");
                        emp1.setEmpEmail(email);
                        Account acc1 = e1.getUserAccountDirectory().createUserAccount("NJHealth", "password1234", emp1, new EnterpriseAdmin());

                        Employee emp2 = e2.getEmployeeDirectory().createEmployee("BostonHealth");
                        emp2.setEmpEmail(email);
                        Account acc2 = e2.getUserAccountDirectory().createUserAccount("BostonHealth", "password1234", emp2, new EnterpriseAdmin());

                        Employee emp3 = e3.getEmployeeDirectory().createEmployee("NYHealth");
                        emp3.setEmpEmail(email);
                        Account acc3 = e3.getUserAccountDirectory().createUserAccount("NYHealth", "password1234", emp3, new EnterpriseAdmin());
                        break;
                    case "Pharmacy":
                        // Pharmacy enterprise
                        Enterprise e4 = ns1.getEnterpriseDirectory().createAndAddEnterprise("NJPharmacy", type, 1111, "745 Secaucus Rd, Jersey City, NJ 07307");
                        Enterprise e5 = ns2.getEnterpriseDirectory().createAndAddEnterprise("BostonPharmacy", type, 1112, "104 Ward Street, Boston, MA 02120");
                        Enterprise e6 = ns3.getEnterpriseDirectory().createAndAddEnterprise("NYPharmacy", type, 1113, "575 Hudson St, New York, NY 10014");

                        // Pharmacy employees
                        Employee emp4 = e4.getEmployeeDirectory().createEmployee("NJPharmacy");
                        emp4.setEmpEmail(email);
                        Account acc4 = e4.getUserAccountDirectory().createUserAccount("NJPharmacy", "password1234", emp4, new EnterpriseAdmin());

                        Employee emp5 = e5.getEmployeeDirectory().createEmployee("BostonPharmacy");
                        emp5.setEmpEmail(email);
                        Account acc5 = e5.getUserAccountDirectory().createUserAccount("BostonPharmacy", "password1234", emp5, new EnterpriseAdmin());

                        Employee emp6 = e6.getEmployeeDirectory().createEmployee("NJPharmacy");
                        emp6.setEmpEmail(email);
                        Account acc6 = e6.getUserAccountDirectory().createUserAccount("NYPharmacy", "password1234", emp6, new EnterpriseAdmin());

                        break;
                    case "InsuranceCompany":
                        // Insurance company enterprise
                        Enterprise e7 = ns1.getEnterpriseDirectory().createAndAddEnterprise("NJInsurance", type, 1111, "745 Secaucus Rd, Jersey City, NJ 07307");
                        Enterprise e8 = ns2.getEnterpriseDirectory().createAndAddEnterprise("BostonInsurance", type, 1112, "104 Ward Street, Boston, MA 02120");
                        Enterprise e9 = ns3.getEnterpriseDirectory().createAndAddEnterprise("NYInsurance", type, 1113, "575 Hudson St, New York, NY 10014");

                        // Insurance company employees
                        Employee emp7 = e7.getEmployeeDirectory().createEmployee("NJInsurance");
                        emp7.setEmpEmail(email);
                        Account acc7 = e7.getUserAccountDirectory().createUserAccount("NJInsurance", "password1234", emp7, new EnterpriseAdmin());

                        Employee emp8 = e8.getEmployeeDirectory().createEmployee("BostonInsurance");
                        emp8.setEmpEmail(email);
                        Account acc8 = e8.getUserAccountDirectory().createUserAccount("BostonInsurance", "password1234", emp8, new EnterpriseAdmin());

                        Employee emp9 = e9.getEmployeeDirectory().createEmployee("NYInsurance");
                        emp9.setEmpEmail(email);
                        Account acc9 = e9.getUserAccountDirectory().createUserAccount("NYInsurance", "password1234", emp9, new EnterpriseAdmin());
                        break;
                    case "Government":
                        // Govt enterprise
                        Enterprise e10 = ns1.getEnterpriseDirectory().createAndAddEnterprise("NJGovt", type, 1111, "745 Secaucus Rd, Jersey City, NJ 07307");
                        Enterprise e11 = ns2.getEnterpriseDirectory().createAndAddEnterprise("BostonGovt", type, 1112, "104 Ward Street, Boston, MA 02120");
                        Enterprise e12 = ns3.getEnterpriseDirectory().createAndAddEnterprise("NYGovt", type, 1113, "575 Hudson St, New York, NY 10014");

                        // Govt employees
//                        Employee emp10 = e10.getEmployeeDirectory().createEmployee("NJInsurance");
//                        emp10.setEmpEmail(email);
//                        Account acc10 = e10.getUserAccountDirectory().createUserAccount("NJInsurance", "password1234", emp10, new EnterpriseAdmin());
//
//                        Employee emp11 = e11.getEmployeeDirectory().createEmployee("BostonInsurance");
//                        emp11.setEmpEmail(email);
//                        Account acc11 = e11.getUserAccountDirectory().createUserAccount("BostonInsurance", "password1234", emp11, new EnterpriseAdmin());
//
//                        Employee emp12 = e12.getEmployeeDirectory().createEmployee("NYGovt");
//                        emp12.setEmpEmail(email);
//                        Account acc12 = e12.getUserAccountDirectory().createUserAccount("NYGovt", "password1234", emp12, new EnterpriseAdmin());
                        break;
                    default:
                        break;
                }
            }
        }

        Employee sys = ecosystem.getEmployeeDirectory().createEmployee("admin");
        // Create account with role: SysAdmin
        Account sysAccount = ecosystem.getUserAccountDirectory().createUserAccount("admin", "admin", sys, new SysAdmin());

        return ecosystem;
    }
}
