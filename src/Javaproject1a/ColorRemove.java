package Javaproject1a;

//Q1b(2): Write a Java program for getting different colors through ArrayList
//and remove the 2nd element and color "Blue" from the ArrayList

import java.util.*;

public class ColorRemove {
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

     // Removing 2nd element (index 1)
     colors.remove(1);
     System.out.println("After removing 2nd element: " + colors);

     // Removing "Blue"
     colors.remove("Blue");
     System.out.println("After removing Blue: " + colors);
 }
}