/*Write a program that ask the user for a postive integer value . The program should use a loop to get the sum of all integer from 1 up to the number entered   */
import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        // Ask the user for a positive integer
        do {
            System.out.print("Enter a positive integer: ");
            number = scanner.nextInt();
            if (number <= 0) {
                System.out.println("Please enter a positive integer.");
            }
        } while (number <= 0);

        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }

        System.out.println("The sum of integers from 1 to " + number + " is: " + sum);
        scanner.close();
    }
}