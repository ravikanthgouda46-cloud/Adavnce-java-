package Javaproject3a;
import java.util.Scanner;

public class ReverseStringExample {

    // User-defined function to reverse a string
    public static String reverseString(String str) {
        String reversed = "";

        // Loop through the string from end to start
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }

        return reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Calling the user-defined function
        String result = reverseString(input);

        // Displaying the result
        System.out.println("Reversed string: " + result);

        scanner.close();
    }
}