package domain.dao;

import domain.Employee;

public class EmployeeDAO {
    public void saveEmployee(Employee employee){
//        DatabaseConnectionManager connectionManager = DatabaseConnectionManager.getManagerInstance();
//        connectionManager.connect();
//        connectionManager.getConnectionObject().prepareStatement("insert into Employee tbl");
//        connectionManager.disconnect();
        System.out.println("saved employee to the database: " + employee);

    }

    public void deleteEmployee(Employee employee){

    }



}
