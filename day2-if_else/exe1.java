/*write an if statement that multiple payRate by 1.5 for hours above 40.*/

import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) {
        double payRate,totalpay,hours,otHours;
        Scanner kb_input= new Scanner(System.in);

        System.out.println("Enter pay rate per hour ");
        payRate=kb_input.nextDouble();
        System.out.println("Enter hours  worked in a week ");
        hours=kb_input.nextDouble();
        if (hours>40)
        {
            otHours=hours - 40;
            totalpay=(40*payRate)+(otHours*payRate*1.5);
            
        }
        else
        {
            totalpay=hours*payRate;
        }
        System.out.println("Total pay is "+totalpay);
    }
}