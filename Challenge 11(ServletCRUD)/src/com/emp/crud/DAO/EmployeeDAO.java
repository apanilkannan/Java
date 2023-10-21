package com.emp.crud.DAO;
import java.util.*;
import com.emp.crud.DTO.Employee;
import java.sql.*;
public class EmployeeDAO {

    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_crud", "root", "admin");
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }
    public static int saveEmployee(Employee e) {
        int status = 0;
        try {
            Connection con = EmployeeDAO.getConnection();
            PreparedStatement ps = con.prepareStatement("insert into emp_table(name, password, email, country) values (?,?,?,?)");
            ps.setString(1, e.getName());
            ps.setString(2, e.getPassword());
            ps.setString(3, e.getEmail());
            ps.setString(4, e.getCountry());

            status = ps.executeUpdate();

            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return status;
    }
    public static int update(Employee e) {
        int status = 0;
        try {
            Connection con = EmployeeDAO.getConnection();
            PreparedStatement ps = con.prepareStatement("update emp_table set name=?, password=?, email=?, country=? where id=?");
            ps.setString(1, e.getName());
            ps.setString(2, e.getPassword());
            ps.setString(3, e.getEmail());
            ps.setString(4, e.getCountry());
            ps.setInt(5, e.getId());

            status = ps.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return status;
    }
    public static int delete(int id) {
        int status = 0;
        try {
            Connection con = EmployeeDAO.getConnection();
            PreparedStatement ps = con.prepareStatement("delete from emp_table where id=?");
            ps.setInt(1, id);
            status = ps.executeUpdate();

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
    }
    public static Employee getEmployeeById(int id) {
        Employee e = new Employee();

        try {
            Connection con = EmployeeDAO.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from emp_table where id=?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                e.setId(rs.getInt(1));
                e.setName(rs.getString(2));
                e.setPassword(rs.getString(3));
                e.setEmail(rs.getString(4));
                e.setCountry(rs.getString(5));
            }
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return e;
    }
    public static List<Employee> getAllEmployees() {
        List<Employee> list = new ArrayList<Employee>();
        try {
            Connection con = EmployeeDAO.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from emp_table");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Employee e = new Employee();
                e.setId(rs.getInt(1));
                e.setName(rs.getString(2));
                e.setPassword(rs.getString(3));
                e.setEmail(rs.getString(4));
                e.setCountry(rs.getString(5));
                list.add(e);
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}

