
package com.mycompany.gui_pt2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex1Window extends JFrame
{
    private JTextField radiusField;
    private JLabel resultLabel;

    public Ex1Window()
    {
        final int WIDTH = 500;
        final int LENGTH = 600;
        setTitle("Simple Window");
        setSize(WIDTH, LENGTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create components
        JLabel promptLabel = new JLabel("Enter radius:");
        radiusField = new JTextField(10);
        JButton calcButton = new JButton("Calculate Circumference");
        resultLabel = new JLabel("Circumference: ");

        // Set layout and add components
        setLayout(new FlowLayout());
        add(promptLabel);
        add(radiusField);
        add(calcButton);
        add(resultLabel);

        // Button action
        calcButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double radius = Double.parseDouble(radiusField.getText());
                    double circumference = 2 * Math.PI * radius;
                    resultLabel.setText(String.format("Circumference: %.2f", circumference));
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Please enter a valid number.");
                }
            }
        });

        setVisible(true);
    }
}
