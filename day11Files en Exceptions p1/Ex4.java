/*
 * Write a program that asks the user for the names of two files. The first file should
 * be opened for reading, and the second file should be opened for writing. The program
 * should read the contents of the first change all charaters to uppercase,and store the results in the secondfile.
 * The second file willbe a copy of the first file,except that all the characters will be uppercase.
 * use Notepad or another text editor to create a simple filethat can be used for the program.
 */
import java.util.Scanner;
import java.io.*;
public class Ex4 
{
    public static void main(String[] args) 
    {
        
        Scanner kb_input = new Scanner(System.in);  
        // Get the file name for file to read from  
        System.out.println("Enter file name to read from:");
        String inputFileName = kb_input.nextLine(); // read the input file name
        // Create a File object for the input file
        File inputFile = new File(inputFileName);
        
        // Get the file name for file to write to
        System.out.println("Enter file name to write to:");
        String outputFileName = kb_input.nextLine(); // read the output file name
        

        // Checking if the input file exists
        if (!inputFile.exists()) 
        {
            System.out.println("Input file does not exist: " + inputFileName);
            kb_input.close(); // Close the Scanner for user input
            return; // Exit the program if the input file does not exist
        }
        try {
            Scanner inputScanner = new Scanner(inputFile); // Create a Scanner object to read from the input file
            StringBuilder ct = new StringBuilder(); // To store the content of the input file
            
            while (inputScanner.hasNextLine())// Check if there is another line in the input file
            { 
                String line = inputScanner.nextLine(); // Read the next line from the input file
                ct.append(line.toUpperCase()).append(System.lineSeparator()); // Convert to uppercase and append to content
            }
            inputScanner.close(); // Close the Scanner object for reading
            
            // Write to the output file
        OutputStream the = new FileOutputStream(outputFileName);
        PrintWriter writer = new PrintWriter(the); // Create a PrintWriter to write to the output file
        writer.write(ct.toString()); // Write the content to the output file
        writer.close(); // Close the PrintWriter
            
            System.out.println("Data has been written to the file: " + outputFileName);
        } catch (Exception e) {
            System.out.println("An error occurred while processing files.");
        } 
            kb_input.close(); // Close the Scanner for user input
    }
}
