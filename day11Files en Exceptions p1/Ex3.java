import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class Ex3 
{
    public static void main(String[] args) 
    {
        Scanner kb_input = new Scanner(System.in);  
        // Get the file name for file to read from  
        System.out.println("Enter file name to read from:");
        String fileName = kb_input.nextLine(); // read the file name
        File fobj = new File(fileName);
        String line;
        //checking if the file exists
        if (!fobj.exists())
        {
            System.out.println("File does not exist: " + fileName);
            kb_input.close(); // Close the Scanner for user input
            return; // Exit the program if the file does not exist
        }
        try 
        {
            Scanner inputFile=new Scanner(fobj); // Create a Scanner object to read from the file   
            while (inputFile.hasNextLine()) // Check if there is another line in the file
            {
                line = inputFile.nextLine(); // Read the next line from the file
                System.out.println(line); // Print the line to the console
            }
            inputFile.close(); // Close the Scanner object
            kb_input.close(); // Close the Scanner for user input
            System.out.println("Data has been read from the file: " + fileName);
        } 
        catch (IOException e) 
        {
            System.out.println("An error occurred while reading the file: " + fileName);
        }
    }
}
