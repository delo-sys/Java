/* Write a program that asks the user to enter a number of seconds.
There are 60 seconds in a minute. If the number of seconds entered by the user is greater than or equal to 60, the program should display the number of minutes in those seconds.
There are 3,600 seconds in an hour. If the number of seconds entered by the user is greater than or equal to 3,600, the program should display the number of hours in those seconds.
There are 86,400 seconds in a day. If the number of seconds entered by the user is greater than or equal to 86,400, the program should display the number of days in those seconds.
*/

import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number of seconds: ");
        int seconds = scanner.nextInt();

        if (seconds >= 86400) {
            int days = seconds / 86400;
            int hours = (seconds % 86400) / 3600;
            int minutes = (seconds % 3600) / 60;
            int secs = seconds % 60;
            System.out.println("That is " + days + " day(s), " + hours + " hour(s), " + minutes + " minute(s), " + secs + " second(s).");
        } else if (seconds >= 3600) {
            int hours = seconds / 3600;
            int minutes = (seconds % 3600) / 60;
            int secs = seconds % 60;
            System.out.println("That is " + hours + " hour(s), " + minutes + " minute(s), " + secs + " second(s).");
        } else if (seconds >= 60) {
            int minutes = seconds / 60;
            int secs = seconds % 60;
            System.out.println("That is " + minutes + " minute(s), " + secs + " second(s).");
        } else {
            System.out.println(seconds + " second(s).");
        }
        scanner.close();
    }
}