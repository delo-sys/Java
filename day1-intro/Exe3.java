
import java.util.Scanner;

public class Exe3 {
        public static void main(String[] arg )
    {
        double total;
        int quantity;
        double price;
        Scanner kb_input = new Scanner(System.in);
        System.out.println("Please enter the price");
        price = Double.parseDouble(kb_input.nextLine());
        System.out.println("Please enter the quantity");
        quantity = Integer.parseInt(kb_input.nextLine());
        total = price * quantity;
        System.out.println("Total amount due is " + total);
    }
}
