package com.jdbc.demo.Insertion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class StudentDelete {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/student";
        String user = "root";
        String password = "admin";
        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, user, password);
            String deleteQuery = "DELETE FROM student WHERE Student_id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery);
            preparedStatement.setInt(1, 1); 
            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println(rowsAffected + " row(s) deleted.");
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
