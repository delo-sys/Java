
package com.mycompany.gui_pt3;

import javax.swing.*;
import java.awt.*;
public class Ex4 extends JFrame
{
        public Ex4()
    {
        setTitle("Border layout");
        setSize(200,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setLayout(new GridLayout(2, 3));
        
        JLabel lblLabel1=new JLabel("Label 1");
        JButton btnButton1=new JButton ("Button 1");
        JLabel lblLabel2=new JLabel("Label 2");
        JButton btnButton2=new JButton ("Button 2");
        JLabel lblLabel3=new JLabel("Label 3");
        JButton btnButton3=new JButton ("Button 3");

        JPanel northJPanel = new JPanel();
        JPanel eastJPanel = new JPanel();
        JPanel westJPanel = new JPanel();
        JPanel centerJPanel = new JPanel();
        JPanel southJPanel = new JPanel();

        northJPanel.add(lblLabel1);
        eastJPanel.add(btnButton1);
        centerJPanel.add(lblLabel2);
        westJPanel.add(btnButton2);
        southJPanel.add(lblLabel3);

        add(northJPanel, BorderLayout.NORTH);
        add(eastJPanel, BorderLayout.EAST);
        add(centerJPanel, BorderLayout.CENTER);
        add(westJPanel, BorderLayout.WEST);
        add(southJPanel, BorderLayout.SOUTH);
        
        JPanel panel = new JPanel();
        panel.add(btnButton3);
        add(panel, BorderLayout.AFTER_LAST_LINE);


    setVisible(true);
}
    public static void main(String []args)
    {
        new Ex4();
    }
}
