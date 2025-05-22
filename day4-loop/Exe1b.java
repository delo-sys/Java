/*Write a program that ask the user for a postive integer value . The program should use a loop to get the sum of all integer from 1 up to the number entered   */
import javax.swing.JOptionPane;

public class Exe1b {
    public static void main(String[] args) {
        int number = 0;
        boolean validInput = false;

        // Ask the user for a positive integer using a dialog box
        while (!validInput) {
            String input = JOptionPane.showInputDialog(null, "Enter a positive integer:");
            if (input == null) {
                // User pressed Cancel or closed the dialog
                JOptionPane.showMessageDialog(null, "No input provided. Exiting program.");
                System.exit(0);
            }
            try {
                number = Integer.parseInt(input);
                if (number > 0) {
                    validInput = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Please enter a positive integer.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid integer.");
            }
        }

        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }

        JOptionPane.showMessageDialog(null, "The sum of integers from 1 to " + number + " is: " + sum);
    }
}