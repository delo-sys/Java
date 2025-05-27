// design a payroll class that has field for an employee's name , ID ,number, hourly  worked . write the appropriate accessor and mutator method and method and a constructor that accept the employe's name and ID number ans arguments.the class should also have a method that returns the employee's gross pay , which is calculated as the number of hours worked multiplied by the hourly pay rate . write a program that demostrates the class by creating payroll object , then asking the user to enter the data for an employee .the program should display the amount of gross pay erned 
// public class Payroll 
// {
//     private String employeeName;
//     private int employeeID;
//     private double hoursWorked;
//     private double hourlyRate;

//     public Payroll(String employeeName, int employeeID) 
//     {
//         this.employeeName = employeeName;
//         this.employeeID = employeeID;
//         // this.hoursWorked = 0;
//         // this.hourlyRate = 0;  
//     }

//     public String getEmployeeName() 
//     {
//         return employeeName;
//     }
//     public void setEmployeeName(String employeeName) 
//     {
//         this.employeeName = employeeName;
//     }
//     public int getEmployeeID() 
//     {
//         return employeeID;
//     }
//     public void setEmployeeID(int employeeID) 
//     {
//         this.employeeID = employeeID;
//     }

//     public double getHourlyRate() 
//     {
//         return hourlyRate;
//     }
//     public void setHourlyRate(double hourlyRate) 
//     {
//         if (hourlyRate > 0) {
//             this.hourlyRate = hourlyRate;
//         } else {
//             System.out.println("Error: Hourly rate must be positive.");
//         }
//     }

//     public double getHoursWorked() 
//     {
//         return hoursWorked;
//     }
//     public void setHoursWorked(double hoursWorked) 
//     {
//         if (hoursWorked >= 0) {
//             this.hoursWorked = hoursWorked;
//         } else {
//             System.out.println("Error: Hours worked cannot be negative.");
//         }
//     }
//     public double calculateGrossPay() 
//     {
//         return hoursWorked * hourlyRate;
//     }
//     public void displayPayrollInfo() 
//     {
//         System.out.println("Employee Name: " + employeeName);
//         System.out.println("Employee ID: " + employeeID);
//         System.out.println("Hours Worked: " + hoursWorked);
//         System.out.println("Hourly Rate: $" + hourlyRate);
//         System.out.printf("Gross Pay: $%.2f%n", calculateGrossPay());
//     }
// }
