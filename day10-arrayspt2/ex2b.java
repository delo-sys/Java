public class ex2b 
{
    public static void displayAverage(int[][] marks) 
    {
        double total = 0;
        int count = 0;
        
        for (int row = 0; row < marks.length; row++) 
        {
            for (int col = 0; col < marks[row].length; col++) 
            {
                total += marks[row][col];
                count++;
            }
        }
        
        double average = total / count;
        System.out.printf("Average marks: %.2f\n", average);
    }
}
