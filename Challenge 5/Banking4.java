package com.hello.core.P5;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Banking4  {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(300, 200);
        f.setLayout(null);
        f.setVisible(true);
        JLabel userLabel = new JLabel("User:");
        userLabel.setBounds(15, 20, 80, 30);
        f.add(userLabel);
        JTextField userField = new JTextField();
        userField.setBounds(100, 20, 175, 30);
        f.add(userField);
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(15, 60, 80, 30);
        f.add(passwordLabel);
        JTextField passwordField = new JTextField();
        passwordField.setBounds(100, 60, 175, 30);
        f.add(passwordField);
        JButton login = new JButton("Login");
        login.setBounds(15, 110, 90, 30);
        f.add(login);
        JButton Register = new JButton("Register");
        Register.setBounds(185, 110, 90, 30);
        f.add(Register);
    }
}

