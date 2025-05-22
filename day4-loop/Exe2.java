/* 
Part 1: Amanda's KPH to MPH conversion table.
Part 2: Score entry with validation and statistics.
*/

import java.util.Scanner;

public class Exe2 {
    public static void main(String[] args) {
        System.out.println("KPH\tMPH");
        for (int kph = 60; kph <= 130; kph += 10) {
            double mph = kph * 0.6214;
            System.out.printf("%d\t%.2f\n", kph, mph);
        }

        int count = 0;
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        double sum = 0;

        System.out.println("\nEnter scores between 0 and 10 (enter -1 to finish):");
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Enter score: ");
                int score = scanner.nextInt();
                if (score == -1) break;
                if (score < 0 || score > 10) {
                    System.out.println("Invalid score. Please enter a value between 0 and 10.");
                    continue;
                }
                count++;
                sum += score;
                if (score > highest) highest = score;
                if (score < lowest) lowest = score;
            }
        }

        if (count > 0) {
            System.out.println("Number of scores entered: " + count);
            System.out.println("Highest score: " + highest);
            System.out.println("Lowest score: " + lowest);
            System.out.printf("Average score: %.2f\n", sum / count);
        } else {
            System.out.println("No valid scores entered.");
        }
    }
}