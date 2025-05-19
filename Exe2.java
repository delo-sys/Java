/*
one acre of is eqivalent to 43,560 square feet.write a program that caculate the number of acres in tract of land with 389,767 square feet :hint divide the size of the tract of land by the size of an acre to get the number of acre. 
 */


public class Exe2 {
    public static void main(String[] args) 
    {
        double squareFeet = 389767;
        float acre = 43560;
        double numberOfAcres = squareFeet / acre;
        System.out.println("Number of acres: " + numberOfAcres);
    }
}
