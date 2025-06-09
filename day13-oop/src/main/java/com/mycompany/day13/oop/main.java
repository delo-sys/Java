/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.day13.oop;

/**
 *
 * @author Student
 */
public class main 
{
    public static void main(String[]args)
    {
        PartTimeEmployee ptemp=new PartTimeEmployee();
        ptemp.setEmpNo("1200");
        ptemp.setEmpname("doca");
        ptemp.setEmpAddress("Nairobi");
        
        System.out.print(ptemp.toString());
    }
}
