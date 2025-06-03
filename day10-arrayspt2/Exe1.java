/*write a program with array that is initialized with test data . use any primitive data type of your chioce .the program should also the following methods
 * get total . this method should accept a one dimensional array as its argument  and return the total of the values in the array
 * get average . this method should accept a one dimensional array as its arugument and return the average of values in the array
 * get highest this method should accept a one dimensional array as its arugument and return the highest of values in the array
 * get lowest this method should accept a one dimensional array as its arugument and return the lowest of values in the array
 */

public class Exe1 
{ 
    public static int getTotal(int[] arr) {
        int total = 0;
        for (int num : arr) {
            total += num;
        }
        return total;
    }

    // Method to get the average of array values
    public static double getAverage(int[] arr) {
        if (arr.length == 0) return 0;
        return (double) getTotal(arr) / arr.length;
    }

    // Method to get the highest value in the array
    public static int getHighest(int[] arr) {
        int highest = arr[0];
        for (int num : arr) {
            if (num > highest) {
                highest = num;
            }
        }
        return highest;
    }

    // Method to get the lowest value in the array
    public static int getLowest(int[] arr) {
        int lowest = arr[0];
        for (int num : arr) {
            if (num < lowest) {
                lowest = num;
            }
        }
        return lowest;
    }

}
