package Javaproject3c;



//Q3c(Q6): Write a Java Program for capitalizing the first letter of each word
//using user defined function capitalizeWords()

public class CapitalizeWords {

 // User-defined function
 public static String capitalizeWords(String str) {

     String[] words = str.split(" ");
     String result = "";

     for (String word : words) {
         if (word.length() > 0) {
             result += Character.toUpperCase(word.charAt(0)) 
                     + word.substring(1) + " ";
         }
     }

     return result.trim();
 }

 public static void main(String[] args) {

     String input = "java programming is fun";

     String output = capitalizeWords(input);

     System.out.println("Original: " + input);
     System.out.println("Capitalized: " + output);
 }
}