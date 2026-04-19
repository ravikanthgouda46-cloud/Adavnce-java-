package Javaproject1a;

//Q1b(4): Write a Java program for getting different colors through ArrayList
//and extract the 1st and 2nd elements using subList()

import java.util.*;

public class ColorSubList {
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

     // Extracting 1st and 2nd elements (index 0 to 2, 2 is exclusive)
     List<String> subList = colors.subList(0, 2);

     // Display sublist
     System.out.println("Extracted SubList (1st & 2nd elements): " + subList);
 }
}