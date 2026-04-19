package Javaproject3c;

//Q3c(Q8): Write a Java Program for verifying if a string contains only numeric characters
//using user defined function isNumeric()

public class heckNumeric {

 // User-defined function
 public static boolean isNumeric(String str) {

     if (str == null || str.isEmpty()) {
         return false;
     }

     for (int i = 0; i < str.length(); i++) {
         if (!Character.isDigit(str.charAt(i))) {
             return false;
         }
     }

     return true;
 }

 public static void main(String[] args) {

     String str1 = "12345";
     String str2 = "123abc";

     System.out.println("str1 is numeric: " + isNumeric(str1));
     System.out.println("str2 is numeric: " + isNumeric(str2));
 }
}
