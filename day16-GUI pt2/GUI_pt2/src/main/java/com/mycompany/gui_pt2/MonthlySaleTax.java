/*A retail company must file a monthly sales tax report listing the total sales for the month,and the amount of state and county sales tax collected.The state sales tax is 4 percent.Create a GUI application that allows the user to
Enter the total for the month into text field . From this figure , the appliction should calulate and display the following 
the amount of county sales tax
the amount of state sales tax 
the total sales tax
in the application's code.repesent the county tax rate (0.02) and the state tax rate (0.04) as named constants      
 */
package com.mycompany.gui_pt2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MonthlySaleTax extends JFrame {
    private static final double COUNTY_TAX_RATE = 0.02;
    private static final double STATE_TAX_RATE = 0.04;

    private JTextField salesField;
    private JLabel countyTaxLabel;
    private JLabel stateTaxLabel;
    private JLabel totalTaxLabel;

    public MonthlySaleTax() {
        setTitle("Monthly Sales Tax Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 5, 5));

        add(new JLabel("Total Sales for the Month:"));
        salesField = new JTextField();
        add(salesField);

        add(new JLabel("County Sales Tax:"));
        countyTaxLabel = new JLabel();
        add(countyTaxLabel);

        add(new JLabel("State Sales Tax:"));
        stateTaxLabel = new JLabel();
        add(stateTaxLabel);

        add(new JLabel("Total Sales Tax:"));
        totalTaxLabel = new JLabel();
        add(totalTaxLabel);

        JButton calcButton = new JButton("Calculate");
        add(calcButton);

        calcButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateTaxes();
            }
        });

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void calculateTaxes() {
        try {
            double sales = Double.parseDouble(salesField.getText());
            double countyTax = sales * COUNTY_TAX_RATE;
            double stateTax = sales * STATE_TAX_RATE;
            double totalTax = countyTax + stateTax;

            countyTaxLabel.setText(String.format("$%.2f", countyTax));
            stateTaxLabel.setText(String.format("$%.2f", stateTax));
            totalTaxLabel.setText(String.format("$%.2f", totalTax));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid sales amount.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MonthlySaleTax());
    }
}
