
package com.mycompany.gui_pt2;
import javax.swing.*;

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
        btnExit=new JButton("Exit");
        panel=new JPanel();
        
        panel.add(lblKilo);
        panel.add(txtKilo);
        panel.add(btnConvert);
        panel.add(btnExit);
        
    }
    public static void main(String[] args)
    {
        new KiloToMiles();
        /* Add action listener for Convert button */
        KiloToMiles frame = new KiloToMiles();
        frame.btnConvert.addActionListener(e -> {
            try {
                double km = Double.parseDouble(frame.txtKilo.getText());
                double miles = km * 0.621371;
                JOptionPane.showMessageDialog(frame, km + " km = " + miles + " miles");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Please enter a valid number.");
            }
        });

        /* Add action listener for Exit button */
        frame.btnExit.addActionListener(e -> System.exit(0));
    }
}
