package com.jdbc.demo.Insertion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudentUpdate {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/student";
        String user = "root";
        String password = "admin";

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, user, password);
            String updateQuery = "UPDATE student SET Student_place = ? WHERE Student_id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
            preparedStatement.setString(1, "Kollam");
            preparedStatement.setInt(2, 1); // Update student with Student_id = 1

            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println(rowsAffected + " row(s) updated.");
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
