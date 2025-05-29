/*write a rainfall class that stores the total rainfall for each of 12months into array of doubles.the program should have method that return the following
 * the total rainfall for the year 
 * the average monthly rainfall
 * the month with the most rainfall
 * the month with the least rainfall
   */

import java.util.Scanner;
public class Exe1 
{
    public static void main(String[] args) {
        Scanner kb_input = new Scanner(System.in);
        double[] rainData = new double[12];
        for (int i = 0; i < rainData.length; i++) {
            System.out.printf("Enter rainfall for month %d: ", i + 1);
            rainData[i] = kb_input.nextDouble();
        }
        Rainfall rainfall = new Rainfall(rainData);
        System.out.printf("Total rainfall for the year: %.2f\n", rainfall.getTotal());
        System.out.printf("Average monthly rainfall: %.2f\n", rainfall.getAverage());  
        System.out.printf("Month with the most rainfall: %.2f\n", rainfall.getmax());
        System.out.printf("Month with the least rainfall: %.2f\n", rainfall.getmin());
    }
}