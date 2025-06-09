import java.util.Scanner;
import java.io.*;
public class Ex2 
{
    //files and Exceptions
  
    public static void main(String[] args)
    {
        String fileName;//file name
        String studentName;//student name
        int numStudents;//number of students
        Scanner kb_input = new Scanner(System.in);
        System.out.println("Enter number of students:");
        numStudents = kb_input.nextInt();//there is always a next line character after an int
        kb_input.nextLine(); // consume the newline character [NB] it resests into blank line
        System.out.println("Enter file name: >> ");
        fileName = kb_input.nextLine(); // read the file name

        try
        {   //if you want to read from an existing file, you can use FileReader instead of FileWriter
            FileWriter fw = new FileWriter(fileName,true); // 'true' to append to the file if it exists or open the file in append mode
            PrintWriter pw = new PrintWriter(fw);
            //get data(student names) from the user
            for (int counter = 1; counter <= numStudents; counter++)
            {
                //get student name from the user
                System.out.println("Enter student name for ST#"+ counter + ":");
                studentName = kb_input.nextLine(); // read the student name
                //write name to the file
                pw.println(studentName); // write the student name to the file
            }
            pw.close(); // close the PrintWriter
            fw.close(); // close the FileWriter
            kb_input.close(); // close the Scanner
            System.out.println("Data has been written to the file: " + fileName);
            
        }
        catch (IOException e)
        {
            System.out.println(" An Error!!! occurred: " + e.getMessage());
        }
    }
}

