/*A painting company has determine that for every 115 square feet of wall space , one gallon of paint and eight hours of labor will required . the company charges $18.00 per hour for labor.write a progrm that allows the user to enter number of room to be painted and the price of the paint per gallon .it should also ask for the square feet of wall space in each room.The program should have method that return the following data:
 * thenumber of gallons of paint required
 * the number of hours of labor required
 * the cost of the paint
 * the cost of the labor
 * the total cost of the paint job
 *The program should display the results on the screen.
 */

import java.util.Scanner;

public class Exe1 {

    public static final int SQ_FT_PER_GALLON = 115;
    public static final int HOURS_PER_GALLON = 8;
    public static final double LABOR_RATE_PER_HOUR = 18.00;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rooms to be painted: ");
        int numRooms = scanner.nextInt();

        System.out.print("Enter the price per gallon of paint: ");
        double pricePerGallon = scanner.nextDouble();

        double totalSqFt = 0;

        for (int i = 0; i < numRooms; i++) {
            System.out.print("Enter the square feet of wall space for room " + (i + 1) + ": ");
            totalSqFt += scanner.nextDouble();
        }

        double gallonsRequired = calculateGallonsRequired(totalSqFt);
        double hoursRequired = calculateHoursRequired(gallonsRequired);
        double paintCost = calculatePaintCost(gallonsRequired, pricePerGallon);
        double laborCost = calculateLaborCost(hoursRequired);
        double totalCost = calculateTotalCost(paintCost, laborCost);

        displayResults(totalSqFt, gallonsRequired, hoursRequired, paintCost, laborCost, totalCost);

        scanner.close();
    }


    public static double calculateGallonsRequired(double totalSqFt) {
        return (totalSqFt / SQ_FT_PER_GALLON);
    }

    public static double calculateHoursRequired(double gallonsRequired) {
        return gallonsRequired * HOURS_PER_GALLON;
    }

    public static double calculatePaintCost(double gallonsRequired, double pricePerGallon) {
        return gallonsRequired * pricePerGallon;
    }

    public static double calculateLaborCost(double hoursRequired) {
        return hoursRequired * LABOR_RATE_PER_HOUR;
    }

    public static double calculateTotalCost(double paintCost, double laborCost) {
        return paintCost + laborCost;
    }

    public static void displayResults(double totalSqFt, double gallonsRequired, double hoursRequired,double paintCost, double laborCost, double totalCost) {
        System.out.println("\nPainting Cost Estimate:");
        System.out.printf("Total wall space: %.2f square feet%n", totalSqFt);
        System.out.printf("Gallons of paint required: %.0f%n", gallonsRequired);
        System.out.printf("Total hours of labor required: %.2f%n", hoursRequired);
        System.out.printf("Cost of paint: $%.2f%n", paintCost);
        System.out.printf("Cost of labor: $%.2f%n", laborCost);
        System.out.printf("Total cost: $%.2f%n", totalCost);
    }
}

