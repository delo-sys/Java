/*
 * write a program that declares an ArrayList of Rental objects
 * continually prompt the user for contract numbers until a sentinel value is entered
 * prompt the user for a number of minutes for the Rental,create a rental object using a contract nimber and minutes values,add
 * the object to the ArrayList
 * After the userenters the sentinel value, display the ArrayList using the Rental toString() method,sort
 * it using the collections.sort() method, and display the ArrayList again.
 * Save the program as RentalArrayList.java 
 */
import java.util.ArrayList;
import java.util.Scanner;
public class RentalArrayList
{
    public static void main(String[] args)
    {
        ArrayList<String> rentals = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String contractNumber;
        
        while (true) {
            System.out.print("Enter contract number (or 'exit' to finish): ");
            contractNumber = scanner.nextLine();
            if (contractNumber.equalsIgnoreCase("exit")) {
                break;
            }
            
            System.out.print("Enter number of minutes: ");
            int minutes = scanner.nextInt();
            scanner.nextLine(); // consume the newline character
            rentals.add(minutes + " minutes for contract number: " + contractNumber);
        }
        System.out.println("\nRentals before sorting:");
        for (String rental : rentals) {
            System.out.println(rental);
        }
        rentals.sort(String::compareTo);
        System.out.println("\nRentals after sorting:");
        for (String rental : rentals) {
            System.out.println(rental);
        }
        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
