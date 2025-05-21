import java.util.Scanner;

public class Ex2 
{
    public static void main(String[] args)
    {
        Scanner kb_input = new Scanner(System.in);
        int marks;
        System.out.println("Enter marks scored");
        marks=kb_input.nextInt();
        if (marks<0||marks>100)
        {
            System.out.println("invalid marks");
        }
        else if (marks>=80)
        {
            System.out.println("Grade is A");
        }
            else if (marks>=70)
        {
            System.out.println("Grade is B");
        }
            else if (marks>=60)
        {
            System.out.println("Grade is C");
        }
            else if (marks>=50)
        {
            System.out.println("Grade is D");
        }
            else if (marks>=40)
        {
            System.out.println("Grade is E");
        }
        else
        {
            System.out.println("Grade is F");
        }
    }
}
