import java.util.Scanner;
public class Ex3keyInput
{
    public static void main(String[] arg )
    {
        String name;
        Scanner kb_input = new Scanner(System.in);
        System.out.println("Please enter your name");
        name=kb_input.nextLine();

        System.out.println("You entered "+name+" as your name");
    }
}