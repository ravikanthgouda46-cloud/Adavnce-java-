package javapropoject3b;

// Q3b(Q3): Write a Java Program for reversing a string using user defined function reverseString()

public class ReverseString {

    // User-defined function
    public static String reverseString(String str) {
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        return reversed;
    }

    public static void main(String[] args) {

        String input = "Java Programming";

        String result = reverseString(input);

        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + result);
    }
}