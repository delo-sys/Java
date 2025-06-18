
package com.mycompany.gui_pt3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Ex5 extends JFrame
{
    private JPanel panel;
    private JLabel lblMessage;
    private JTextField txtKilo;
    
    private JRadioButton rbMiles;
    private JRadioButton rbFeet;
    private JRadioButton rbInches;
    private ButtonGroup rbGroup;
    
    public Ex5()
    {
        lblMessage=new JLabel("Enter distance in kilometers ");
        txtKilo=new JTextField(10);
        rbMiles=new JRadioButton("convert to miles");
        rbInches=new JRadioButton("convert to inches");
        rbFeet=new JRadioButton("convert to feet");
        
        //Group the Buttons
        rbGroup=new ButtonGroup();
        rbGroup.add(rbMiles);
        rbGroup.add(rbFeet);
        rbGroup.add(rbInches);
        
        rbMiles.addActionListener(new RadioButtonListener());
        rbFeet.addActionListener(new RadioButtonListener());
        rbInches.addActionListener(new RadioButtonListener());
        
        panel=new JPanel();
        panel.add(lblMessage);
        panel.add(txtKilo);
        panel.add(rbMiles);
        panel.add(rbFeet);
        panel.add(rbInches);
        add(panel);
        setVisible(true);
        
        // Add the panel to the frame
        this.add(panel);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    class RadioButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String kilos;
            double output=0.0;
            String convertUnits = "";
            
            kilos =txtKilo.getText();
            
            if(e.getSource()==rbMiles)
            {
                output=Double.parseDouble(kilos)*0.6214;
                convertUnits="Miles";
            }
            else if (e.getSource()==rbFeet)
            {
                output=Double.parseDouble(kilos)*3281.0;
                convertUnits="Feet";
            }
            else if (e.getSource()==rbInches)
            {
                output=Double.parseDouble(kilos)*39370.0;
                convertUnits="Inches";
            }
            String message = kilos + " is equivalent to : " + output + " " + convertUnits;
            JOptionPane.showMessageDialog(null, message);
        }
    }

    public static void main(String []args)
    {
        new Ex5();
    }
}
