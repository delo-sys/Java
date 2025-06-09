/*
 * Write a program that creates a string arraylist.Continually prompt  the user for strings to add to the list until
 * a sentinel value is enteres.Use an iterator to display all the Strings, then continually ask 
 * the user for a string to eliminate until a sentinel value is entered.
 * After each string is eliminated, display the new list.If the user attempts to continue to eliminate atrings
 * afterthe list is empty,display an appropriate message,and end the program. Save the file as RemoveWords.java
 */
import java.util.ArrayList;
import java.util.Scanner;
public class RemoveWords
{
    public static void main(String[] args)
    {
        removeWords();
    }

    public static void removeWords()
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> wordsList = new ArrayList<>();
        String input;

        // Prompt user to add strings until sentinel value is entered
        System.out.println("Enter words to add to the list (type 'exit' to stop):");
        while (true) {
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            wordsList.add(input);
        }
        //importance of equalsIgnoreCase is to ensure that the user can enter 'exit' in any case (e.g., 'Exit', 'EXIT', etc.)
        // Display all strings using an iterator
        System.out.println("Current list of words: " + wordsList);

        // Continually ask user for a string to eliminate until sentinel value is entered
        while (true) {
            System.out.println("Enter a word to remove from the list (type 'exit' to stop):");
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            if (wordsList.remove(input)) {
                System.out.println("Updated list after removing '" + input + "': " + wordsList);
            } else {
                System.out.println("'" + input + "' not found in the list.");
            }

            if (wordsList.isEmpty()) {
                System.out.println("The list is now empty. Ending program.");
                break;
            }
        }

        scanner.close();
    }
}
