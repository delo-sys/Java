import javax.swing.JOptionPane;

public class Exeb1 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter a number of seconds:");
        int seconds = Integer.parseInt(input);

        if (seconds >= 86400) {
            int days = seconds / 86400;
            int hours = (seconds % 86400) / 3600;
            int minutes = (seconds % 3600) / 60;
            int secs = seconds % 60;
            JOptionPane.showMessageDialog(null, "That is " + days + " day(s), " + hours + " hour(s), " + minutes + " minute(s), " + secs + " second(s).");
        } else if (seconds >= 3600) {
            int hours = seconds / 3600;
            int minutes = (seconds % 3600) / 60;
            int secs = seconds % 60;
            JOptionPane.showMessageDialog(null, "That is " + hours + " hour(s), " + minutes + " minute(s), " + secs + " second(s).");
        } else if (seconds >= 60) {
            int minutes = seconds / 60;
            int secs = seconds % 60;
            JOptionPane.showMessageDialog(null, "That is " + minutes + " minute(s), " + secs + " second(s).");
        } else {
            JOptionPane.showMessageDialog(null, seconds + " second(s).");
        }
    }
}