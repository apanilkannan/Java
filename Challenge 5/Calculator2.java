package com.hello.core.P5;
import java.awt.*;
import java.awt.event.*;
public class Calculator2 implements ActionListener {
    double operand1, operand2, result;
    String currentInput = "";
    char operator = ' ';
    Frame frame;
    TextField display;
    Panel buttonPanel;
    Button[] numberButtons;
    Button addButton, subtractButton, multiplyButton, divideButton, equalsButton, clearButton, decimalButton;
    Calculator2() {
        frame = new Frame("Calculator2");
        frame.setLayout(new BorderLayout());
        display = new TextField();
        display.setEditable(false);
        frame.add(display, BorderLayout.NORTH);
        buttonPanel = new Panel();
        buttonPanel.setLayout(new GridLayout(5, 4));
        numberButtons = new Button[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new Button(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            buttonPanel.add(numberButtons[i]);
        }
        addButton = new Button("+");
        subtractButton = new Button("-");
        multiplyButton = new Button("*");
        divideButton = new Button("/");
        equalsButton = new Button("=");
        clearButton = new Button("C");
        decimalButton = new Button(".");
        addButton.addActionListener(this);
        subtractButton.addActionListener(this);
        multiplyButton.addActionListener(this);
        divideButton.addActionListener(this);
        equalsButton.addActionListener(this);
        clearButton.addActionListener(this);
        decimalButton.addActionListener(this);
        buttonPanel.add(addButton);
        buttonPanel.add(subtractButton);
        buttonPanel.add(multiplyButton);
        buttonPanel.add(divideButton);
        buttonPanel.add(numberButtons[7]);
        buttonPanel.add(numberButtons[8]);
        buttonPanel.add(numberButtons[9]);
        buttonPanel.add(clearButton);
        buttonPanel.add(numberButtons[4]);
        buttonPanel.add(numberButtons[5]);
        buttonPanel.add(numberButtons[6]);
        buttonPanel.add(equalsButton);
        buttonPanel.add(numberButtons[1]);
        buttonPanel.add(numberButtons[2]);
        buttonPanel.add(numberButtons[3]);
        buttonPanel.add(decimalButton);
        buttonPanel.add(numberButtons[0]);
        buttonPanel.add(new Button("")); 
        buttonPanel.add(new Button("")); 
        buttonPanel.add(new Button("")); 
        frame.add(buttonPanel, BorderLayout.CENTER);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.setSize(300, 400);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.matches("[0-9]")) {
            currentInput += command;
            display.setText(currentInput);
        } else if (e.getSource() == decimalButton && !currentInput.contains(".")) {
            currentInput += ".";
            display.setText(currentInput);
        } else if (command.equals("+") || command.equals("-") || command.equals("*") || command.equals("/")) {
            if (!currentInput.isEmpty()) {
                operand1 = Double.parseDouble(currentInput);
                operator = command.charAt(0);
                currentInput = "";
            }
        } else if (e.getSource() == equalsButton) {
            if (!currentInput.isEmpty()) {
                operand2 = Double.parseDouble(currentInput);
                switch (operator) {
                    case '+':
                        result = operand1 + operand2;
                        break;
                    case '-':
                        result = operand1 - operand2;
                        break;
                    case '*':
                        result = operand1 * operand2;
                        break;
                    case '/':
                        if (operand2 != 0) {
                            result = operand1 / operand2;
                        } else {
                            display.setText("Error");
                            return;
                        }
                        break;
                }
                display.setText(String.valueOf(result));
                currentInput = String.valueOf(result);
                operator = ' ';
            }
        } else if (e.getSource() == clearButton) {
            operand1 = operand2 = result = 0;
            currentInput = "";
            operator = ' ';
            display.setText("");
        }
    }
    public static void main(String[] args) {
        new Calculator2();
    }
}
