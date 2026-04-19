package javapropoject3b;

// Q3b(Q4): Write a Java Program for checking if a string is palindrome
// using user defined function isPalindrome()

public class PalindromeCheck {

    // User-defined function
    public static boolean isPalindrome(String str) {

        // Remove spaces and convert to lowercase
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Reverse string
        String reversed = new StringBuilder(str).reverse().toString();

        // Compare
        return str.equals(reversed);
    }

    public static void main(String[] args) {

        String input1 = "Madam";
        String input2 = "Hello";

        System.out.println("Input: " + input1 + " → Palindrome? " + isPalindrome(input1));
        System.out.println("Input: " + input2 + " → Palindrome? " + isPalindrome(input2));
    }
}