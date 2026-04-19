package javapropoject3b;

// Q3b(Q5): Write a Java Program for eliminating all whitespace characters
// from a string using user defined function removeWhitespace()

public class RemoveWhitespace {

    // User-defined function
    public static String removeWhitespace(String str) {
        return str.replaceAll("\\s", "");
    }

    public static void main(String[] args) {

        String input = "Java Programming is Fun";

        String result = removeWhitespace(input);

        System.out.println("Original String: " + input);
        System.out.println("After removing whitespace: " + result);
    }
}