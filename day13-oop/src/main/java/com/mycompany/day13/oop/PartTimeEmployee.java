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
    private double hoursWorked;
    private double rate;
public PartTimeEmployee()
{
    super();
}
    public PartTimeEmployee(String no,String name,String address,double hours,double rate)
    {
    super(no,name,address);
    this.hoursWorked=hours;
    this.rate=rate;
    }
}
