import java.util.Scanner;

public class ex2 
{
    // two dimendional Array
    public static void main(String[] args) 
    {
        Scanner kb_input = new Scanner(System.in);
        int[][] marks1=new int [3][2];
        int[][] marks2={{41,52},{63,57},{76,90}};//
        // for (int row=0;row<marks1.length;row++)
        // {
        //     System.out.printf("Enter marks for %d",row+1);
        //     for(int col=0; col<marks1[row].length; col++)
        //     {
        //         System.out.printf("Enter test #%d marks ",col+1);
        //         marks1[row][col]=kb_input.nextInt();
        //     }
        // }
        displayAverage(marks2);
    }

    
    public static void displayAverage(int[][] marks) 
    {
        
        
        for (int row = 0; row < marks.length; row++) 
        {
            int sum=0;
            for (int col = 0; col < marks[row].length; col++) 
            {
                sum += marks[row][col];
            }
            double average = (double)sum / marks[row].length;
            System.out.printf("Average marks for row %d: %.2f\n", row + 1, average);
        }
    }
}
