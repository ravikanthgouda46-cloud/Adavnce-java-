package Javaproject3c;

//Q3c(Q10): Write a Java Program for counting the number of words in a string
//using user defined function countWords()

public class WordCount {

 // User-defined function
 public static int countWords(String str) {

     if (str == null || str.trim().isEmpty()) {
         return 0;
     }

     String[] words = str.trim().split("\\s+");
     return words.length;
 }

 public static void main(String[] args) {

     String input = "Java programming is very easy to learn";

     int result = countWords(input);

     System.out.println("Input String: " + input);
     System.out.println("Number of words: " + result);
 }
}