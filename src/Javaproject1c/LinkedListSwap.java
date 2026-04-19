package Javaproject1c;

//Q1c(5): Write a Java program that swaps two elements
//(first and third elements) in a linked list using Collections.swap()

import java.util.*;

public class LinkedListSwap {
 public static void main(String[] args) {

     // Creating LinkedList
     LinkedList<String> list = new LinkedList<>();

     // Adding elements
     list.add("Apple");
     list.add("Banana");
     list.add("Orange");
     list.add("Mango");

     // Display original list
     System.out.println("Original LinkedList: " + list);

     // Swap first (index 0) and third (index 2)
     Collections.swap(list, 0, 2);

     // Display updated list
     System.out.println("After swapping 1st and 3rd elements: " + list);
 }
}