package Javaproject1a;

//Q1b(1): Write a Java program for getting different colors through ArrayList
//and search whether the color "Red" is available or not.

import java.util.*;

public class ColorSearch {
 public static void main(String[] args) {

     // Creating ArrayList
     ArrayList<String> colors = new ArrayList<>();

     // Adding colors
     colors.add("Blue");
     colors.add("Green");
     colors.add("Yellow");
     colors.add("Red");

     // Display list
     System.out.println("Colors List: " + colors);

     // Searching for "Red"
     if (colors.contains("Red")) {
         System.out.println("Red is available in the list.");
     } else {
         System.out.println("Red is NOT available in the list.");
     }
 }
}