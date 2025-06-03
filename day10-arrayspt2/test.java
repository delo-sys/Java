import java.util.Scanner;
public class test 
{
    public static void main(String[] args) 
    {
        
        // Initialize array with test data
        int[] testData = {10, 25, 7, 42, 18, 5};

        System.out.println("Total: " +Exe1.getTotal(testData));
        System.out.println("Average: " + Exe1.getAverage(testData));
        System.out.println("Highest: " + Exe1.getHighest(testData));
        System.out.println("Lowest: " + Exe1.getLowest(testData));
    }
}
