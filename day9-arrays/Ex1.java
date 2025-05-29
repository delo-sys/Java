import java.util.Scanner;
public class Ex1 
{
    public static void main(String[] args) 
    {
        int[]marks={20,76,45,91,66};
        double prices[];
        double minprice=0;
        double maxprice=0;
        prices=new double[10];
        Scanner kb_input= new Scanner(System.in);
        for (int index=0;index<5;index++)
        {
            System.out.println(marks[index]);
        }
        int total = 0;
        for (int i = 0; i < marks.length; i++) 
        {
            total += marks[i];
        }
        System.out.println("Total: " + total);

        int average = 0;
        average= total/5;
        System.out.printf("average: "+average);

        for (int counter=0;counter<prices.length;counter++)
        {
            System.out.printf("enter price for item #%d\n", counter+1 );
            prices[counter]=kb_input.nextDouble();
        }
        for (double price : prices) 
        {
            System.out.printf("Price: KSH %.2f\n", price);
        }
        minprice = prices[0];
        maxprice = prices[0];
        for (int counter = 1; counter < prices.length; counter++)
        {
            if (prices[counter] < minprice)
            {
                minprice = prices[counter];
            }
            if (prices[counter] > maxprice)
            {
                maxprice = prices[counter];
            }
        }
        System.out.printf("The lowest price is KSH %.2f\n", minprice);
        System.out.printf("The highest price is KSH %.2f\n", maxprice);
    }

}