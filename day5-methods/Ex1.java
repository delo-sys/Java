import java.util.Scanner;

public class Ex1 
{
    public static void main(String[] args)
    {
        int x=5,y=10,w;
        System.out.println("program STARTING");
        displaymessage();
        displaymessage2("Fidel");
        w=addnumbers(x, y);
        System.out.println("The sum is "+w);
        System.out.println("The number are equal: "+isEqual(y, w));
        System.out.println("program ENDING");
    }

    public static void displaymessage()
    {
        System.out.println("WELCOME TO JAVA METHODS");
    }

        public static void displaymessage2(String name )
    {
        System.out.println("HI "+name+" Methods make Java easier");
    }

    public static int addnumbers(int num1,int num2) 
    {
        int sum =num1+num2;
        return sum;
    }

    public static boolean isEqual(int num1,int num)
    {
        if(num1==num)
        {
            return true;
        
        }
        else
        {
            return false;
        }
    }
}