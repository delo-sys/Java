package com.mycompany;

public class HouseLoan extends Loan implements LoanDetails 
{
    //inner class
    private class Guarantor
    {
        
    }
    @Override
    public double getInterest()
    {
        System.out.println("House Loan interest");
        return 0.0;
    }
    
    @Override
    public void displayDetails()
    {
    System.out.println("House Loan interest");  
    }
    
}
