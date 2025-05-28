import javax.swing.JOptionPane;

public class DemoBankAccount2 {
    public static void main(String[] args) 
    {
        String input;

        input=JOptionPane.showInputDialog("Enter new account number:");
        int accNo = Integer.parseInt(input);

        input=JOptionPane.showInputDialog("Enter starting balance:");
        double startingBalance = Double.parseDouble(input);

        BankAccount2 account = new BankAccount2(startingBalance);
        JOptionPane.showMessageDialog(null, "Account created with balance: " + account.getBalance());

        boolean running = true;
        while (running)
        {
            String[] options = {"Create Account", "Deposit", "Withdraw", "Check Balance","account details", "Exit"};
            int choice = JOptionPane.showOptionDialog(
                null,
                "Choose an action:",
                "Bank Menu",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                options,
                options[0]
            );

            switch (choice) {
                case 0: 
                    input = JOptionPane.showInputDialog("Enter new account number:");
                    accNo = Integer.parseInt(input);
                    input = JOptionPane.showInputDialog("Enter starting balance:");
                    startingBalance = Double.parseDouble(input);
                    account = new BankAccount2(startingBalance);
                    JOptionPane.showMessageDialog(null, "Account created with balance: " + account.getBalance());
                    break;
                case 1: 
                    input = JOptionPane.showInputDialog("Enter amount to deposit:");
                    double depositAmount = Double.parseDouble(input);
                    account.deposit(depositAmount);
                    JOptionPane.showMessageDialog(null, "Deposited: " + depositAmount);
                    break;
                case 2: 
                    input = JOptionPane.showInputDialog("Enter amount to withdraw:");
                    double withdrawAmount = Double.parseDouble(input);
                    account.withdraw(withdrawAmount);
                    JOptionPane.showMessageDialog(null, "Withdrew: " + withdrawAmount);
                    break;
                case 3: 
                    JOptionPane.showMessageDialog(null, "Current balance: " + account.getBalance());
                    break;
                case 4: 
                    input = JOptionPane.showInputDialog("Enter account number to check:");
                    int checkAccNo = Integer.parseInt(input);
                    if (checkAccNo == accNo) {
                        JOptionPane.showMessageDialog(null, "Account Number: " + accNo + ", Balance: " + account.getBalance());
                    } else {
                        JOptionPane.showMessageDialog(null, "Account not found.");
                    }
                    break;
                case 5: 
                case JOptionPane.CLOSED_OPTION:
                    running = false;
                    break;
                default:
                    running = false;
            }
        }
    }
}
