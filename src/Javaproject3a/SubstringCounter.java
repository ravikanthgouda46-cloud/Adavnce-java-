package Javaproject3a;
import java.util.Scanner;

public class SubstringCounter {

    // User-defined function to count occurrences
    public static int countOccurrences(String mainString, String subString) {
        int count = 0;
        int index = 0;

        while ((index = mainString.indexOf(subString, index)) != -1) {
            count++;
            index = index + subString.length(); // move ahead
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter the main string: ");
        String mainString = sc.nextLine();

        System.out.print("Enter the substring: ");
        String subString = sc.nextLine();

        // Calling function
        int result = countOccurrences(mainString, subString);

        // Output
        System.out.println("The substring appears " + result + " times.");

        sc.close();
    }
}