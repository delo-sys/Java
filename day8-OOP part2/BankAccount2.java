import javax.swing.JOptionPane;

public class BankAccount2 
{
    private double balance;
    private int accNo;

    public BankAccount2()
    {
        this.balance = 0.0;
        this.accNo = 0;
    }
    public BankAccount2(double startBalance)
    {
        this.balance = startBalance;
    }

    public BankAccount2(String strbalance)
    {
        this.balance = Double.parseDouble(strbalance);
    }

    public void deposit (double amount)
    {
        if (amount > 0) 
        {
            this.balance += amount;
            // System.out.println("Deposit successful. New balance: " + this.balance);
            JOptionPane.showMessageDialog(null, "Deposit successful. New balance: " + this.balance);
        } else 
        {
            // System.out.println("Deposit amount must be positive.");
            JOptionPane.showMessageDialog(null, "Deposit amount must be positive.");
        }
    }

    public void withdraw (double amount)
    {
        if (amount > 0 && amount <= this.balance) 
        {
            this.balance -= amount;
            // System.out.println("Withdrawal successful. New balance: " + this.balance);
            JOptionPane.showMessageDialog(null, "Withdrawal successful. New balance: " + this.balance);
        } else if (amount > this.balance) 
        {
            // System.out.println("Insufficient funds for withdrawal.");
            JOptionPane.showMessageDialog(null, "Insufficient funds for withdrawal.");
        } else 
        {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    public double getBalance() 
    {
        return balance;
    }

    public void setBalance(double amount) 
    {
        balance= amount;
    }

    public void getAccountDetails(int accNo) 
    {
    if (this.accNo == accNo) 
        {
            System.out.println("Account Number: " + this.accNo + ", Balance: " + this.balance);
        } else 
        {
            System.out.println("Account not found.");
        }
    }
}