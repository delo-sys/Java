
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
    }
}
