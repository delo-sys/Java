/*write a rainfall class that stores the total rainfall for each of 12months into array of doubles.the program should have method that return the following
 * the total rainfall for the year 
 * the average monthly rainfall
 * the month with the most rainfall
 * the month with the least rainfall
   */

public class Rainfall 
{
    double [] rainData;
    public Rainfall(double[]r)
    {
        rainData=new double[r.length];
        for(int index = 0;index <r.length;index++)
        {
            rainData[index]=r[index];
        }
    }
    public double getTotal()
    {
        double total=0.0;
        for(int index = 0;index <rainData.length;index++)
        {
            total+=rainData[index];
        }
        return total;
    }
    public double getAverage()
    {
        double average = getTotal() / rainData.length;
        return average;
    }
    public double getmax()
    {
        double highest =rainData[0];
        for(int index = 0;index <rainData.length;index++)
        {
            if (rainData[index]>highest)
            {
                highest=rainData[index];
            }
        }
        return highest; 
    }

    public double getmin()
    {
        double lowest =rainData[0];
        for(int index = 0;index<rainData.length;index++)
        {
            if (rainData[index]<lowest)
            {
                lowest=rainData[index];
            }
        }
        return lowest; 
    }
}
