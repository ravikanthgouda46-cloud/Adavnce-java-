package Javaproject1a;

//Q1b(3): Write a Java program for getting different colors through ArrayList
//and sort them using Collections.sort()

import java.util.*;

public class ColorSort {
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

     // Sorting the list
     Collections.sort(colors);

     // Display sorted list
     System.out.println("Sorted List: " + colors);
 }
}
