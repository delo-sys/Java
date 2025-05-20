/*consider a banking program that determines whether a bank customer qualifies for special,low interest rate on to qualify ,two condition must exist : (1)the customer's salary must be at least ksh 300,000 and (2) the customer must have held his or her current job for at least two years. */
import java.util.Scanner;

public class exe2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter customer's salary: ");
        double salary = input.nextDouble();
        System.out.print("Enter number of years at current job: ");
        int yearsOnJob = input.nextInt();

        boolean hasHighSalary = salary >= 300000;
        boolean hasSufficientJobExperience = yearsOnJob >= 2;

        if (hasHighSalary && hasSufficientJobExperience) {
            System.out.println("Customer qualifies for special low interest rate.");
        } else {
            System.out.println("Customer does not qualify for special low interest rate.");
        }
    }
}