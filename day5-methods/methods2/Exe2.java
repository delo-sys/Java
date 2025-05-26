/*write a program that ask the user enter five test scores .The program should display a letter for each score and the average test score . write the following methods in the program :
 * calculateAverage - this method should accept an array of test scores as an argument and return the average score.
 * determineGrade - this method should accept a test score as an argument and return a letter grade for the score.
 */
import java.util.Scanner;
public class Exe2 {
    public static void main(String[] args) 
    {
        Scanner kb_input = new Scanner(System.in);
        double[] scores = new double[5];
        for (int i = 0; i < scores.length; i++) {
            System.out.print("Enter test score " + (i + 1) + ": ");
            scores[i] = kb_input.nextDouble();
        }
        double averageScore = calculateAverage(scores);

        System.out.printf("Average test score: %.2f\n", averageScore);
        System.out.println("Letter grade for average score: " + determineGrade(averageScore));
        System.out.println("Letter grades for each score:");
        for (double score : scores) {
            String grade = determineGrade(score);
            System.out.printf("Score: %.2f, Grade: %s\n", score, grade);
        }
    }
    public static double calculateAverage(double[] scores) {
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        return sum / scores.length;
    }

    public static String determineGrade(double score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}