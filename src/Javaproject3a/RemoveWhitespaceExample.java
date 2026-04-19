package Javaproject3a;
import java.util.Scanner;

public class RemoveWhitespaceExample {

    // User-defined function to remove all whitespace
    public static String removeWhitespace(String str) {
        // \s matches all whitespace characters (spaces, tabs, newlines)
        return str.replaceAll("\\s", "");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Calling the function
        String result = removeWhitespace(input);

        // Displaying the result
        System.out.println("String after removing whitespace: " + result);

        scanner.close();
    }
}