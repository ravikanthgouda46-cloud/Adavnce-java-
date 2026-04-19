package Javaproject1a;

//Q1b(5): Write a Java program for getting different colors through ArrayList
//and delete nth element using remove by index

import java.util.*;

public class ColorRemoveNth {
 public static void main(String[] args) {

     // Creating ArrayList
     ArrayList<String> colors = new ArrayList<>();

     // Adding colors
     colors.add("Blue");
     colors.add("Green");
     colors.add("Yellow");
     colors.add("Red");

     // Display original list
     System.out.println("Original List: " + colors);

     // Remove nth element (example: 3rd element → index 2)
     int n = 2; // you can change this value

     if (n >= 0 && n < colors.size()) {
         colors.remove(n);
         System.out.println("After removing element at index " + n + ": " + colors);
     } else {
         System.out.println("Invalid index");
     }
 }
}