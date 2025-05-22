import javax.swing.JOptionPane;
// input validation
public class Ex4 {
    public static void main(String[] args) {
        int marks;
        String input;
        input= JOptionPane.showInputDialog("Enter Marks scored");
        marks=Integer.parseInt(input);
        // validate marks entered
        while (marks<0||marks>100)
        {
            input= JOptionPane.showInputDialog("Marks must be between 0 and 100");
            marks=Integer.parseInt(input);
        }
        JOptionPane.showMessageDialog(null,"marks socred "+input+"%");
        System.exit(0);
    }
}
