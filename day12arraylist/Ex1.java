import java.util.ArrayList;
public class Ex1
{
    //Array list.is dynamic you can remove and add elements
    //Array is static you cannot add or remove elements
    //ARRAYLIST IS DYNAMIC cannot store primitive data types
    //ARRAY IS STATIC can store primitive data types
    public static void main(String[]args)
    {
        Double num=5.5;//Object type
        double numb=Double.valueOf(num);//Primitive type

        ArrayList<String> namelist = new ArrayList<String>();
        namelist.add("John");
        namelist.add("kenneth");
        namelist.add("Vicky");
        namelist.add("Castro");

        //storing a double in an array list
        ArrayList<Double> prices = new ArrayList<Double>();
        prices.add(12.99);
        prices.add(15.49);
        prices.add(9.99);
        prices.add(20.00);
        //storing an integer in an array list
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(90);
        marks.add(85);
        marks.add(78);
        //storing a boolean in an array list
        ArrayList<Boolean> PassedList = new ArrayList<>();
        //how to determine size of an array list
        System.out.println("Size of the name list: " + namelist.size());
        System.out.println("Size of the price list: " + prices.size());
        System.out.println("Size of the marks list: " + marks.size());

        //using get method to retrieve elements
        System.out.println("First name in the list: " + namelist.get(0));
        System.out.println("First price in the list: " + prices.get(0));
        System.out.println("First mark in the list: " + marks.get(0));
        //printing the entire list
        System.out.println("Name list: " + namelist);
        System.out.println("Price list: " + prices);
        System.out.println("Marks list: " + marks);

        //removing an element from the list
        namelist.remove(3); //Removes an item at a specific index

        //using set method to update elements
        namelist.set(0, "Michael");//Replaces an item at a specific index
        prices.set(0, 10.99);
        marks.set(0, 95);
        System.out.println("Updated name list: " + namelist);
        System.out.println("Updated price list: " + prices);
        System.out.println("Updated marks list: " + marks);
        //inserting an element at a specific index
        namelist.add(2, "Alice"); //Inserts an item at a specific index
        prices.add(1, 18.75);
        marks.add(1, 88);
        System.out.println("Name list after insertion: " + namelist);
        System.out.println("Price list after insertion: " + prices);
        System.out.println("Marks list after insertion: " + marks);
       

    }
}




