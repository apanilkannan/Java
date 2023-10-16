package com.jdbc.demo.Insertion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentRead {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/student";
        String user = "root";
        String password = "admin";

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, user, password);
            Statement statement = connection.createStatement();
            String selectQuery = "SELECT * FROM student";
            ResultSet resultSet = statement.executeQuery(selectQuery);

            while (resultSet.next()) {
                int studentId = resultSet.getInt("Student_id");
                String studentName = resultSet.getString("Student_name");
                String studentPlace = resultSet.getString("Student_place");
                String course = resultSet.getString("course");
                String contactNum = resultSet.getString("contact_num");

                System.out.println("Student ID: " + studentId);
                System.out.println("Student Name: " + studentName);
                System.out.println("Student Place: " + studentPlace);
                System.out.println("Course: " + course);
                System.out.println("Contact Number: " + contactNum);
                System.out.println();
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

