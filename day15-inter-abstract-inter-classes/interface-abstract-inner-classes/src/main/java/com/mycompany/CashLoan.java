package com.mycompany;

public class CashLoan extends Loan 
{
    @Override
    public double getInterest()
    {
        System.out.println("cash interest");
        return 0.0;
    }
}
