package Javaproject3c;

//Q3c(Q7): Write a Java Program for shortening a string to a specified length
//and adding an ellipsis using user defined function truncate()

public class TruncateString {

 // User-defined function
 public static String truncate(String str, int length) {

     if (str.length() <= length) {
         return str;
     }

     return str.substring(0, length) + "...";
 }

 public static void main(String[] args) {

     String input = "Java programming is very interesting";

     String output = truncate(input, 15);

     System.out.println("Original: " + input);
     System.out.println("Truncated: " + output);
 }
}