package com.mycompany.day13.oop;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
public class PartTimeEmployee extends Employee
{
    private int hoursWorked;
    private double rate;
public PartTimeEmployee()
{
    super();
}
    public PartTimeEmployee(String no,String name,String address,int hours,double rate)
    {
    super(no,name,address);
    this.hoursWorked=hours;
    this.rate=rate;
    }
    public int getHoursWorked()
    {
        return this.hoursWorked;
    }
    
    public double getrate()
    {
        return this.rate;
    }
    
    public void setHoursWorked(int hrs)
    {
        this.hoursWorked = hrs;
    }
    
    public void setrate(double r)
    {
        this.rate = r;
    }
    public double getpay()
    {
        return this.hoursWorked*this.rate; 
    }
}
