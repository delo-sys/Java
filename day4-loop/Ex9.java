public class Ex9 {
    public static void main(String[] args) 
    {
        for (int i=1;i<+10;i++)
        {
            System.out.printf("%d\n",i);
            if (i==5)
            {
                break;// completely stop the iteration
            }
        System.out.printf("%d\n",i);
        }
            for (int i=1;i<+10;i++)
        {
            
            if (i==5)
            {
                continue;//skip alteration
            }
            System.out.printf("%d\n",i);
        }
    }
}
