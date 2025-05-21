public class Ex1 {
    public static void main(String[] args) 
    {
        double priceperunit = 12.87;
        double quanity=24.5;
        double num=3.456/2.333;

        double total = priceperunit*quanity;

        // System.out.println(total);
        // System.out.println(num);

        System.out.printf("%f\n",total);
        System.out.printf("%f\n",num);

        System.out.printf("total %.2f and num is %.2f", total,num);


    }
}
