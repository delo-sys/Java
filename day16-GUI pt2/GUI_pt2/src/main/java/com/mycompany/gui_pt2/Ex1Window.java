
package com.mycompany.gui_pt2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Area;


public class Ex1Window extends JFrame
{
    private JPanel panel;
    private JTextField txtRadius;
    private JLabel lblRadius;
    private JButton btnCalArea;
    private JButton btnCalPer;
    private JButton btnExit;
    private final int WIDTH=300;
    private final int LENGTH=400;

    public Ex1Window() 
    {
        setTitle("cumference");
        setSize(WIDTH,LENGTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        buildPanel();

        add(panel);

        setVisible(true);
    }


    public void buildPanel()
    {
        lblRadius=new JLabel("Enter radius in meters");
        txtRadius=new JTextField(5);
        btnCalArea=new JButton("calculate area");
        btnCalArea.addActionListener(new BtnCalAreaListener());
        btnCalPer=new JButton("calculate cumference");
        btnCalPer.addActionListener(new btnCalPerListener());
        btnExit=new JButton("Exit");
        btnExit.addActionListener(new btnExitListener());

        panel = new JPanel();

        panel.add(lblRadius);
        panel.add(txtRadius);
        panel.add(btnCalArea);
        panel.add(btnCalPer);
        panel.add(btnExit);
    }

        public static void main(String[] args) {
        new Ex1Window();
    }
    
    private class BtnCalAreaListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            final double PI = 3.14;
            String input;
            input = txtRadius.getText();
            double area= 0.0;
            try {
                area = PI * Math.pow(Double.parseDouble(input), 2);
                JOptionPane.showMessageDialog(panel, input + " Area " + area );
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(panel, "Invalid input. Please enter a numeric value for the radius.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

        private class btnCalPerListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            final double CONVERSION = 3.14;
            String input;
            input = txtRadius.getText();
            double per = 0.0;
            try {
                per = CONVERSION *2* Double.parseDouble(input);
                JOptionPane.showMessageDialog(panel, input + " Circumference " + per + " meters.");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(panel, "Please enter a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    

    private class btnExitListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            System.exit(0);
        }
    }
}