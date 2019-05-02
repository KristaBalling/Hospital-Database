package clients;

import domain.Employee;
import domain.dao.EmployeeDAO;

public class ClientModule {

    public static void main(String args[]){

        Employee peggy = new Employee(1, "peggy", "accounting", true);
        ClientModule.hireNewEmployee(peggy);
    }
    public static void hireNewEmployee(Employee employee) {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.saveEmployee(employee);
    }
    public static void terminateEmployee(Employee employee) {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.deleteEmployee(employee);
    }
}
