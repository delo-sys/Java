import java.util.Scanner;
public class Ex1
{
    public static void main(String[] args)
    {
        int test1,test2,test3;
        double average;

        Scanner kb_input=new Scanner(System.in);
        System.out.println("Enter test 1 marks");
        test1=kb_input.nextInt();
        System.out.println("Enter test 2 marks");
        test2=kb_input.nextInt();
        System.out.println("Enter test 3 marks");
        test3=kb_input.nextInt();
        average=(test1 + test2 + test3) / 3;

        System.out.println("the average is "+average);
        if (average>=50)
        {
            System.out.println("congratulation you have passed");
        }
    else
    {
        System.out.println("Sorry Try again next time ");
    }
    }
}
