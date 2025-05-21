/*an internet service provider has three different subscription packages for its customers:
package A : For $9.95 per month 10 hours of access are provided.Additional hours are 2.00per hour.
package B : For $13.95 per month 20 hours of access are provided.Additional hours are 1.00per hour.
package C : For $19.95 per month unlimted access are provided.
write a program that calculate a customer's monthly bill .It should ask the user to enter the letter of the package the customer has purchased(A,B or C) and number of hours that were used.It should then display the total charges modify the program you wrote so it also calculate and displays package A customers would savew if they purchased package B or C and the amount of money package B customers would save if they purchased package C .If there would be no savings . no message should be printed   
 */
import javax.swing.JOptionPane;

public class Exe2 {
    public static void main(String[] args) {
        String pkg = JOptionPane.showInputDialog("Enter your package (A, B, or C):");
        if (pkg == null) return; // User cancelled

        pkg = pkg.trim().toUpperCase();

        
        String hoursInput = JOptionPane.showInputDialog("Enter the number of hours used:");
        if (hoursInput == null) return;

        double hours;
        try {
            hours = Double.parseDouble(hoursInput);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid number of hours.");
            return;
        }

        
        double billA = 9.95 + Math.max(0, hours - 10) * 2.00;
        double billB = 13.95 + Math.max(0, hours - 20) * 1.00;
        double billC = 19.95;

        StringBuilder message = new StringBuilder();

        switch (pkg) {
            case "A":
                message.append(String.format("Your bill for Package A is: $%.2f\n", billA));
                if (billA > billB) {
                    message.append(String.format("You would save $%.2f with Package B.\n", billA - billB));
                }
                if (billA > billC) {
                    message.append(String.format("You would save $%.2f with Package C.\n", billA - billC));
                }
                break;
            case "B":
                message.append(String.format("Your bill for Package B is: $%.2f\n", billB));
                if (billB > billC) {
                    message.append(String.format("You would save $%.2f with Package C.\n", billB - billC));
                }
                break;
            case "C":
                message.append(String.format("Your bill for Package C is: $%.2f\n", billC));
                break;
            default:
                message.append("Invalid package selection.");
        }

        JOptionPane.showMessageDialog(null, message.toString());
    }
}