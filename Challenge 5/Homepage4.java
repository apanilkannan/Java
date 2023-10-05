package com.hello.core.P5;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Homepage4 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Bank System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu viewMenu = new JMenu("View");
        JMenu optionMenu = new JMenu("Options");
        JMenu windowMenu = new JMenu("Window");
        JMenu helpMenu = new JMenu("Help");

        JMenuItem openNewAccountItem = new JMenuItem("Open New Account");
        JMenuItem printCustomerBalanceItem = new JMenuItem("Print Customer Balance");
        JMenuItem quitBankSystemItem = new JMenuItem("Quit Bank System");

        openNewAccountItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Add your logic for opening a new account here
                JOptionPane.showMessageDialog(frame, "Open New Account selected");
            }
        });
        printCustomerBalanceItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add your logic for printing customer balance here
                JOptionPane.showMessageDialog(frame, "Print Customer Balance selected");
            }
        });
        quitBankSystemItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add your logic for quitting the bank system here
                System.exit(0);
            }
        });
        fileMenu.add(openNewAccountItem);
        fileMenu.add(printCustomerBalanceItem);
        fileMenu.addSeparator();
        fileMenu.add(quitBankSystemItem);
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(viewMenu);
        menuBar.add(optionMenu);
        menuBar.add(windowMenu);
        menuBar.add(helpMenu);
        frame.setJMenuBar(menuBar);
        frame.setPreferredSize(new Dimension(400, 300));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
