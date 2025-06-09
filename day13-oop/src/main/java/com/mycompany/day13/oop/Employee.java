/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.day13.oop;

/**
 *
 * @author Student
 */
public class Employee 
{
    private String empNo;
    private String empName;
    private String empAddress;
    
    public Employee()
    {
    }
    
    public Employee (String no, String name,String address)
    {
        this.empNo=no;
        this.empName=name;
        this.empAddress=address;
    }
    
    public void setEmpNo(String no)
    {
    this.empNo=no;
    }
    public void setEmpname(String name)
    {
    this.empName=name;
    }
    public void setEmpAddress(String address)
    {
    this.empAddress=address;
    }
    
    @Override
    public String toString(){
        String details = String.format("employee no %s: employee name: %s address: %s\n ",this.empNo,this.empName,this.empAddress);
        return details;
    }
}
    
