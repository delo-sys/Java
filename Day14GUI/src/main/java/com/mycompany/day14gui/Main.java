
package com.mycompany.day14gui;
import java.awt.*;
import javax.swing.*;
public class Main {

    public static void main(String[] args) 
    {
    final int WIDTH=400;    
    final int LENGTH=600;
    //create window
    JFrame window=new JFrame();
    JButton button=new JButton("click me");
    JTextField txtField=new JTextField(20);
    JPanel panel=new JPanel();
    
    window.setTitle("first window");
    window.setSize(WIDTH,LENGTH);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.getContentPane().setBackground(Color.white);
    window.add(new JLabel("Hello, World!"));
    window.add(new JTextField("Type here"));
    window.add(new JButton("Click Me"));
    //dislpay the 
    window.add(panel);
    panel.add(txtField);
    panel.add(button);
    window.pack();
    window.setVisible(true);
    
    }
}
