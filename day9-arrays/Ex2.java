import java.util.Scanner;
public class Ex2 
{
    public static void main(String[] args) {
        int numTest;
        int[] marks ;
        Scanner kb_input=new Scanner(System.in);
        System.out.println("how many student do you have");
        numTest=kb_input.nextInt();

        marks=new int [numTest];
        int i = 0;
        while (i < numTest) {
            System.out.println("Enter marks for student #" + (i + 1) + ":");
            marks[i] = kb_input.nextInt();
            i++;
            
        }

        int sum = 0;
        i = 0;
        while (i < numTest) {
            sum += marks[i];
            i++;
        }
        double average = (double) sum / numTest;
        System.out.println("Average marks: " + average);

        int max = marks[0];
        i = 1;
        while (i < numTest) {
            if (marks[i] > max) {
                max = marks[i];
            }
            i++;
        }
        System.out.println("Maximum marks: " + max);

        int min = marks[0];
        i = 1;
        while (i > numTest) {
            if (marks[i] > min) {
                max = marks[i];
            }
            i--;
        }
        System.out.println("Minimum marks: " + min);
    }
}
