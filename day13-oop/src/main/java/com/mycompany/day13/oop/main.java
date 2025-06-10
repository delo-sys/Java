/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.day13.oop;

/**
 *
 * @author Student
 */
import java.util.Scanner;

public class main 
{
    static Scanner kb_input=new Scanner (System.in);
    public static void main(String[]args)
    {
        String no,name,address;
        int hrs;
        double rate;
        double sales;
        
        System.out.println("Enter employee number:");
        no=kb_input.nextLine();
        System.out.println("Enter employee name:");
        name=kb_input.nextLine();
        System.out.println("Enter employee address");
        address=kb_input.nextLine();
        System.out.println("Enter employee hoursWorked");
        hrs=kb_input.nextInt();
        
        kb_input.nextLine();
        
        System.out.println("Enter PAY RATE PER HOUR");
        rate=kb_input.nextDouble();

        System.out.println("Enter SALES AMOUNT");
        sales=kb_input.nextDouble();
        
        PartTimeEmployee pt1=new PartTimeEmployee(no,name,address,hrs,rate);
        System.out.print(pt1);
            System.out.print(pt1.getpay());
            
        ComissionEmployee ce = new ComissionEmployee(no, name, address,rate, sales);
        System.out.print(ce);
        System.out.print(ce.getpay());
//        PartTimeEmployee ptemp=new PartTimeEmployee();
//        ptemp.setEmpNo("1200");
//        ptemp.setEmpname("doca");
//        ptemp.setEmpAddress("Nairobi");
        
//        System.out.print(ptemp.toString());
    }
}
