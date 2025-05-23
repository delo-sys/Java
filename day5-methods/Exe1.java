/*
Write a program that asks the user to enter an item's wholesale cost and its markup percentage.
It should then display the retail price.
If an item's wholesale cost is 5.00 and its markup percentage is 100 percent, then the item's retail price is 10.00.
*/
import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the item's wholesale cost: ");
        double wholesaleCost = input.nextDouble();

        System.out.print("Enter the markup percentage: ");
        double markupPercent = input.nextDouble();

        double retailPrice = calculateRetail(wholesaleCost, markupPercent);

        System.out.printf("The retail price is: $%.2f\n", retailPrice);
    }

    public static double calculateRetail(double cost, double percent) {
        return cost + (cost * percent / 100);
    }
}