/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.day13.oop;

/**
 *
 * @author Student
 */
public class ComissionEmployee extends Employee 
{
    private double empRate;
    private double empSales;
    private double empComission;
    public ComissionEmployee(double rate,double sales)
    {

    super();
    
    }
    public ComissionEmployee(String no,String name,String address,double rate,double sales)
    {
        super(no,name,address);
        this.empRate=rate;
        this.empSales=sales;
        
    }

}
