package com.jdbc.demo.Insertion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class StudentInsert {
	public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/student";
        String user = "root";
        String password = "admin";
        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, user, password);
            String insertQuery = "INSERT INTO student (Student_name, Student_place, course, contact_num) VALUES (?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setString(1, "John");
            preparedStatement.setString(2, "Trivandrum");
            preparedStatement.setString(3, "Computer Science");
            preparedStatement.setString(4, "123-456-7890");
            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println(rowsAffected + " row(s) inserted.");
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
