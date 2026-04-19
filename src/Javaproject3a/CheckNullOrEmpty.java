
package Javaproject3a;

// Q3b(Q1): Write a Java Program for checking if a given string is null 
// or contains only whitespace using user defined function isNullOrEmpty()

public class CheckNullOrEmpty {

    // User-defined function
    public static boolean isNullOrEmpty(String str) {
        if (str == null || str.trim().isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        String str1 = null;
        String str2 = "";
        String str3 = "   ";
        String str4 = "Java";

        System.out.println("str1 is null/empty: " + isNullOrEmpty(str1));
        System.out.println("str2 is null/empty: " + isNullOrEmpty(str2));
        System.out.println("str3 is null/empty: " + isNullOrEmpty(str3));
        System.out.println("str4 is null/empty: " + isNullOrEmpty(str4));
    }
}