
package com.mycompany.gui_pt3;

import javax.swing.*;
import java.awt.*;
public class Ex2 extends JFrame
{
    public Ex2()
    {
        setTitle("Border layout");
        setSize(200,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        JLabel lblLabel1=new JLabel("Label 1");
        JButton btnButton1=new JButton ("Button 1");
        JLabel lblLabel2=new JLabel("Label 2");
        JButton btnButton2=new JButton ("Button 2");
        JLabel lblLabel3=new JLabel("Label 3");
        JButton btnButton3=new JButton ("Button 3");

        add(lblLabel1,BorderLayout.NORTH);
        add(btnButton1,BorderLayout.EAST);
        add(lblLabel2,BorderLayout.CENTER);
        add(btnButton2,BorderLayout.WEST);
        add(lblLabel3,BorderLayout.SOUTH);
        
    setVisible(true);
    }
        public static void main(String []args)
    {
        new Ex2();
    }
}
