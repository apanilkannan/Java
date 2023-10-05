package com.hello.core.P5;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
public class CustomerDetails4 {
    public static void main(String[] args) {
        JFrame frame;
        JTable table;
        JPanel labelPanel;
        DefaultTableModel tableModel;
        frame = new JFrame("Customer Details");
        frame.setSize(1000, 600);
        labelPanel = new JPanel();
        labelPanel.setBackground(Color.GRAY);
        labelPanel.setBounds(380, 0, 200, 50);
        JLabel viewLabel = new JLabel("VIEW CUSTOMER DETAILS");
        viewLabel.setForeground(Color.RED);
        labelPanel.add(viewLabel); 
        tableModel = new DefaultTableModel();
        tableModel.addColumn("Account Number");
        tableModel.addColumn("Customer Name");
        tableModel.addColumn("Opening Date");
        tableModel.addColumn("Bank Balance");
        table = new JTable(tableModel);
        JScrollPane tableScrollPane = new JScrollPane(table);
        frame.setLayout(null); 
        frame.add(labelPanel);
        tableScrollPane.setBounds(10, 70, 980, 480); 
        frame.add(tableScrollPane);
        String[] rowData1 = {"123456", "John Doe", "2023-01-15", "$10,000"};
        String[] rowData2 = {"789012", "Jane Smith", "2023-02-20", "$8,500"};
        tableModel.addRow(rowData1);
        tableModel.addRow(rowData2);
        frame.setVisible(true);
    }
}





