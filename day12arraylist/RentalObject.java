public class RentalObject 
{
    private int contractNumber;
    private int minutes;

    public RentalObject() 
    {
      //default constructor
        
    }
    public RentalObject(int contractNumber, int minutes) 
    {
        this.contractNumber = contractNumber;
        this.minutes = minutes;
    }
    public int getContractNumber() 
    {
        return contractNumber;
    }
    public int getMinutes() 
    {
        return minutes;
    }
    public void setContractNumber(int contractNumber) 
    {
        this.contractNumber = contractNumber;
    }
    public void setMinutes(int minutes) 
    {
        this.minutes = minutes;
    }
    @Override
    public String toString()
    {
        String str;
        str=String.format("Contract Number: %d \t minutes %s",this.getContractNumber(),this.getMinutes());
        return str;
    }
    //what is the meaning of the toString() method?
    // The toString() method is used to provide a string representation of the object.
    // It is often overridden in classes to return a meaningful string that describes the object.
    // When you print an object, Java automatically calls the toString() method to get the string representation.
    //meaning of overriding?
    // Overriding means providing a new implementation of a method in a subclass that already exists in its superclass.
    // In this case, the toString() method is overridden to provide a custom string representation of the RentalObject class.
    // This allows you to control how the object is represented as a string when printed or converted to a string.
    //notation of the toString() method?
    // The notation of the toString() method is as follows:
    // public String toString() {
    //     // method body
    // }
    // It is a public method that returns a String. The method does not take any parameters.
    
}
