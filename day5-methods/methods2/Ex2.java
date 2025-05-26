import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) 
    {
        Scanner kb_input = new Scanner(System.in);
        int score1, score2, score3, score4, score5;
        double average;
        System.out.println("Enter score #1:");
        score1 = kb_input.nextInt();
        System.out.println("Enter scores #2:");
        score2 = kb_input.nextInt();
        System.out.println("Enter score #3:");
        score3 = kb_input.nextInt();
        System.out.println("Enter score #4:");
        score4 = kb_input.nextInt();
        System.out.println("Enter score #5:");
        score5 = kb_input.nextInt();
        average = calcAverage(score1, score2, score3, score4, score5);
        System.out.printf("The average is ",+average);
        System.out.println("Grade for test score #1 is: " + determineGrade(score1));
        System.out.println("Grade for test score #2 is: " + determineGrade(score2));
        System.out.println("Grade for test score #3 is: " + determineGrade(score3));
        System.out.println("Grade for test score #4 is: " + determineGrade(score4));
        System.out.println("Grade for test score #5 is: " + determineGrade(score5));
        System.out.printf("The average is:" + determineGrade((int)average) );
        
    }
    public static double calcAverage (int score1,int score2,int score3,int score4,int score5)
    {
        double average;
        average = (score1 + score2 + score3 + score4 + score5)/5;
        return average;
    }
    public static char determineGrade(int score)
    {
        if (score >= 90)
        {
            return 'A';
        }
        else if (score >= 80)
        {
            return 'B';
        }
        else if (score >= 70)
        {
            return 'C';
        }
        else if (score >= 60)
        {
            return 'D';
        }
        else
        {
            return 'F';
        }
    } 
}
