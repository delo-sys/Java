/*design a payroll class that has field for an employee's name , ID ,number, hourly  worked . write the appropriate accessor and mutator method and method and a constructor that accept the employe's name and ID number ans arguments.the class should also have a method that returns the employee's gross pay , which is calculated as the number of hours worked multiplied by the hourly pay rate . write a program that demostrates the class by creating payroll object , then asking the user to enter the data for an employee .the program should display the amount of gross pay erned  */

import java.util.Scanner;

class Payroll {
    private String name;
    private int id;
    private double hoursWorked;
    private double hourlyRate;

    public Payroll(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getGrossPay() {
        return hoursWorked * hourlyRate;
    }

    public void displayPayrollInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Gross Pay: " + getGrossPay());
    }
}

public class Exe2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting employee details from user
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter employee ID number: ");
        int id = scanner.nextInt();

        // Creating Payroll object
        Payroll employee = new Payroll(name,id);

        System.out.print("Enter hours worked: ");
        double hours = scanner.nextDouble();
        employee.setHoursWorked(hours);

        System.out.print("Enter hourly pay rate: ");
        double rate = scanner.nextDouble();
        employee.setHourlyRate(rate);

        // Display payroll information
        System.out.println("\nPayroll Information:");
        employee.displayPayrollInfo();

    }
}

