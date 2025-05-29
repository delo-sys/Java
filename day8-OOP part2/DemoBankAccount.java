import javax.swing.JOptionPane;
public class DemoBankAccount 
{
    public static void main(String[] args) 
    {
        String input;

        input=JOptionPane.showInputDialog("Enter new account number:");
        int accNo = Integer.parseInt(input);

        input=JOptionPane.showInputDialog("Enter starting balance:");
        double startingBalance = Double.parseDouble(input);

        BankAccount account = new BankAccount(startingBalance);
        JOptionPane.showMessageDialog(null, "Account created with balance: " + account.getBalance());

    }
}