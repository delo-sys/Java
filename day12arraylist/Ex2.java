import java.util.ArrayList;
import java.util.Scanner;
public class Ex2 
{
    public static void main(String[] args) {
       int contractnumber, minutes;
       ArrayList<RentalObject> rentalList = new ArrayList<>();
       Scanner kb_input=new Scanner(System.in);
        System.out.println("Enter contract number (or negative number to quit): ");
        contractnumber = kb_input.nextInt();
         while (contractnumber >= 0)  // Continue until a negative number is entered
            {
                System.out.println("Enter contract minutes");
                minutes = kb_input.nextInt();
                RentalObject rental = new RentalObject(contractnumber, minutes);
                rentalList.add(rental); // Add the rental object to the list
                System.out.println("Enter contract number (or negative number to quit): ");
                contractnumber = kb_input.nextInt();
            }
    }
}
