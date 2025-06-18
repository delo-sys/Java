package com.mycompany.gui_pt3;
import javax.swing.*;
import java.awt.*;

public class Ex1 extends JFrame 
{
    public Ex1()
    {
        setTitle("flow layout");
        setSize(200,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
     //add flow layout manager 
        setLayout(new FlowLayout(FlowLayout.RIGHT));
        JLabel lblLabel1=new JLabel("Label 1");
        JButton btnButton1=new JButton ("Button 1");
        JLabel lblLabel2=new JLabel("Label 2");
        JButton btnButton2=new JButton ("Button 2");
        JLabel lblLabel3=new JLabel("Label 3");
        JButton btnButton3=new JButton ("Button 3");
        
        add(lblLabel1);
        add(btnButton1);
        add(lblLabel2);
        add(btnButton2);
        add(lblLabel3);
        add(btnButton3);
        
        setVisible(true);
    }
    public static void main(String []args)
    {
        new Ex1();
    }
}
