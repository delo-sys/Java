// public class BankAccount 
// {
//     private double balance;
//     private int accNo;

//     public BankAccount()
//     {
//         this.balance = 0.0;
//         this.accNo = 0;
//     }
//     public BankAccount(double startBalance)
//     {
//         this.balance = startBalance;
//     }

//     public BankAccount(String strbalance)
//     {
//         this.balance = Double.parseDouble(strbalance);
//     }

//     public void deposit (double amount)
//     {
//         if (amount > 0) 
//         {
//             this.balance += amount;
//             System.out.println("Deposit successful. New balance: " + this.balance);
//         } else 
//         {
//             System.out.println("Deposit amount must be positive.");
//         }
//     }

//     public void withdraw (double amount)
//     {
//         if (amount > 0 && amount <= this.balance) 
//         {
//             this.balance -= amount;
//             System.out.println("Withdrawal successful. New balance: " + this.balance);
//         } else if (amount > this.balance) 
//         {
//             System.out.println("Insufficient funds for withdrawal.");
//         } else 
//         {
//             System.out.println("Withdrawal amount must be positive.");
//         }
//     }

//     public double getBalance() 
//     {
//         return balance;
//     }

//     public void setBalance(double amount) 
//     {
//         balance= amount;
//     }

//     public void getAccountDetails(int accNo) 
//     {
//     if (this.accNo == accNo) 
//         {
//             System.out.println("Account Number: " + this.accNo + ", Balance: " + this.balance);
//         } else 
//         {
//             System.out.println("Account not found.");
//         }
//     }
// }