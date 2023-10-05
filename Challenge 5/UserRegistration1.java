package com.hello.core.P5;
import java.awt.*;
import java.awt.event.*;
public class UserRegistration1 extends Frame {
    private TextField firstNameField, lastNameField, dobField, placeField, contactField;
    private CheckboxGroup genderGroup;
    private Checkbox maleCheckbox, femaleCheckbox;
    private Button submitButton;
    public UserRegistration1() {
        setTitle("User Registration Form");
        setSize(400, 300);
        setLayout(new GridLayout(7, 2, 10, 10));
        setResizable(false);

        add(new Label("First Name:"));
        firstNameField = new TextField();
        add(firstNameField);

        add(new Label("Last Name:"));
        lastNameField = new TextField();
        add(lastNameField);

        add(new Label("Date of Birth:"));
        dobField = new TextField();
        add(dobField);

        add(new Label("Gender:"));
        genderGroup = new CheckboxGroup();
        maleCheckbox = new Checkbox("Male", genderGroup, false);
        femaleCheckbox = new Checkbox("Female", genderGroup, false);
        Panel genderPanel = new Panel();
        genderPanel.add(maleCheckbox);
        genderPanel.add(femaleCheckbox);
        add(genderPanel);

        add(new Label("Place:"));
        placeField = new TextField();
        add(placeField);

        add(new Label("Contact Number:"));
        contactField = new TextField();
        add(contactField);

        submitButton = new Button("Submit");
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String firstName = firstNameField.getText();
                String lastName = lastNameField.getText();
                String dob = dobField.getText();
                String gender = maleCheckbox.getState() ? "Male" : "Female";
                String place = placeField.getText();
                String contact = contactField.getText();
                System.out.println("First Name: " + firstName);
                System.out.println("Last Name: " + lastName);
                System.out.println("Date of Birth: " + dob);
                System.out.println("Gender: " + gender);
                System.out.println("Place: " + place);
                System.out.println("Contact Number: " + contact);
            }
        });
        add(submitButton);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
        setVisible(true);
    }
    public static void main(String[] args) {
        new UserRegistration1();
    }
}


