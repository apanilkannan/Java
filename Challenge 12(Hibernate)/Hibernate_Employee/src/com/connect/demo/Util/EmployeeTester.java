package com.connect.demo.Util;
import java.util.List;
import com.connect.demo.DAO.EmployeeDAO;
import com.connect.demo.DTO.EmployeeDTO;
public class EmployeeTester {
    public static void main(String[] args) {
        EmployeeDAO dao = new EmployeeDAO();
        EmployeeDTO newEmployee = new EmployeeDTO();
        //CRUD
        newEmployee.setEname("Akhil");
        newEmployee.setDeptno(30);
        newEmployee.setJob("Manager");
        newEmployee.setSal(16000);
        dao.create(newEmployee);
        newEmployee.setEname("John");
        newEmployee.setDeptno(40);
        newEmployee.setJob("Analyst");
        newEmployee.setSal(8000);
        dao.create(newEmployee);
        System.out.println("Employee created and persisted to the database.");
        List<EmployeeDTO> allEmployees = dao.retrieveAllEmployees(); 
        System.out.println("All Employees from the database:");
        for (EmployeeDTO employee : allEmployees) {
            System.out.println(employee);
        }
        dao.deleteEmployeesByDeptno(30);
        System.out.println("Employees with deptno 30 deleted.");
        dao.updateSalaries(8000, 11000);
        System.out.println("Salaries updated from 50000 to 55000.");
        //HQL
        List<EmployeeDTO> employeesStartingWithA = dao.retrieveEmployeesWithNameStartingWithA();
        System.out.println("Employees with names starting with 'A':");
        for (EmployeeDTO employee : employeesStartingWithA) {
            System.out.println(employee);
        }
        List<EmployeeDTO> employeesSalaryBtw = dao.retrieveEmployeesSalaryInBtw();
        System.out.println("Employees with Salary Between 5000 and 7000:");
        for (EmployeeDTO employee : employeesSalaryBtw) {
            System.out.println(employee);
        }
        List<EmployeeDTO> employeesSecondMinMax = dao.retrieveSecondMinMax();
        System.out.println("Employees with 2nd minimum and 2nd maximum salaries:");
        for (EmployeeDTO employee : employeesSecondMinMax) {
            System.out.println(employee);
        }
        dao.executeUpdateQuery();
        System.out.println("Updated Employee Salary to 5000 Who Have Same Salary.");
        dao.closeSessionFactory();
    }
}
