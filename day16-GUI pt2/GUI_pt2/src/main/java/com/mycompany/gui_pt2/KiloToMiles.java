
package com.mycompany.gui_pt2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KiloToMiles extends JFrame 
{
    private JPanel panel;
    private JTextField txtKilo;
    private JLabel lblKilo;
    private JButton btnConvert;
    private JButton btnExit;
    private final int WIDTH=300;
    private final int LENGTH=300;
    
    public KiloToMiles()
    {
        setTitle("km to miles");
        setSize(WIDTH,LENGTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        buildPanel();
        
        add(panel);
        
        setVisible(true);     
    }
    
    public void buildPanel()
    {
        lblKilo=new JLabel("Enter Distance in KMs");
        txtKilo=new JTextField(10);
        btnConvert=new JButton("Convert");
        btnConvert.addActionListener(new BtnConvertListener());
        btnExit=new JButton("Exit");
        btnExit.addActionListener(new btnExitListener());
        panel=new JPanel();
        
        panel.add(lblKilo);
        panel.add(txtKilo);
        panel.add(btnConvert);
        panel.add(btnExit);
        
    }
    public static void main(String[] args) {
        new KiloToMiles();
    }
    
    private class BtnConvertListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            final double CONVERSION = 0.6214;
            String input;
            input = txtKilo.getText();
            double miles = 0.0;
            try {
                miles = CONVERSION * Double.parseDouble(input);
                JOptionPane.showMessageDialog(panel, input + " kilometers is " + miles + " miles.");
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
