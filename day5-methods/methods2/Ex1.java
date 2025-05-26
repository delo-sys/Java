public class Ex1 
{
    public static void main(String[] args) 
    {
        double totalSqFeet;
        double pricePerGallon;
        double gallonsofpaint;
        double hoursRequired;
        double labourCharges;
        double totalCostPaint;

        java.util.Scanner input = new java.util.Scanner(System.in);
        
        System.out.print("Enter the number of rooms to be painted: ");
        int numRooms = input.nextInt();
        
        System.out.print("Enter the price per gallon of paint: ");
        pricePerGallon = input.nextDouble();
        
        totalSqFeet = getTotalSqFeet(numRooms, input);
        
        gallonsofpaint = getgallons(totalSqFeet);
        
        hoursRequired = getHours(totalSqFeet);
        
        labourCharges = getLabourCharges(hoursRequired);
        
        totalCostPaint = getTotalCostPaint(gallonsofpaint, pricePerGallon);
        
        System.out.printf("\nPainting Cost Estimate:\n");
        System.out.printf("Total square feet to be painted: %.2f\n", totalSqFeet);
        System.out.printf("Gallons of paint required: %.2f\n", gallonsofpaint);
        System.out.printf("Hours required for painting: %.2f\n", hoursRequired);
        System.out.printf("Labour charges: $%.2f\n", labourCharges);
        System.out.printf("Total cost of paint: $%.2f\n", totalCostPaint);
    }
    public static double getgallons(double totalSqFeet)
    {
        double gallonsofpaint;
        gallonsofpaint=totalSqFeet/115;
        return gallonsofpaint;
    }
    public static double getHours(double totalSqFeet)
    {
        double hoursRequired;
        hoursRequired=(totalSqFeet/115)*8;
        return hoursRequired;
    }
    public static double getLabourCharges(double hoursRequired)
    {
        double labourCharges;
        labourCharges=hoursRequired*18;
        return labourCharges;
    }
    public static double getTotalCostPaint(double gallonsofpaint, double pricePerGallon) 
    {
        double totalCostPaint;
        totalCostPaint = pricePerGallon * gallonsofpaint;
        return totalCostPaint;
    }

    public static double getTotalSqFeet(int numRooms, java.util.Scanner input)
    {
        double totalSqFeet = 0;
        for (int i = 1; i <= numRooms; i++) {
            System.out.print("Enter the square feet of wall space in room " + i + ": ");
            totalSqFeet += input.nextDouble();
        }
        return totalSqFeet;
    }
}
