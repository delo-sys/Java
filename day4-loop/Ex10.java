import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) 
    {
        int numStudent,numTest,score,total;
        double Average;

        Scanner kb_input = new Scanner(System.in);
        System.out.println("Enter number of student:");
        numStudent=kb_input.nextInt();

        System.out.println("Enter number of tests ");
        numTest=kb_input.nextInt();

        // cpture and process all the score for students
        for (int students=1;students<=numStudent;students++)
        {
            total=0;
            System.out.println("student number "+students);
            for(int tests=1; tests<=numTest;tests++)
            {
                System.out.println("Enter marks for test #"+tests);
                score=kb_input.nextInt();
                total+=score;
            }
            Average=total/numTest;
            System.out.printf("the average for student %d is %f: ",students,Average);
        }
    }
}
