package Javaproject1c;

//Q1c(4): Write a Java program to display elements and their positions
//in a linked list using get(p)

import java.util.*;

public class LinkedListPositions {
 public static void main(String[] args) {

     // Creating LinkedList
     LinkedList<String> list = new LinkedList<>();

     // Adding elements
     list.add("Apple");
     list.add("Banana");
     list.add("Orange");
     list.add("Mango");

     // Display elements with positions
     System.out.println("Elements with their positions:");

     for (int i = 0; i < list.size(); i++) {
         System.out.println("Position " + i + ": " + list.get(i));
     }
 }
}