package Javaproject1c;

//Q1c(3): Write a Java program to insert the specified element at the end
//of a linked list using offerLast()

import java.util.*;

public class LinkedListInsertEnd {
 public static void main(String[] args) {

     // Creating LinkedList
     LinkedList<String> list = new LinkedList<>();

     // Adding elements
     list.add("Red");
     list.add("Green");
     list.add("Blue");

     // Display original list
     System.out.println("Original LinkedList: " + list);

     // Inserting element at the end
     list.offerLast("Pink");

     // Display updated list
     System.out.println("After inserting 'Pink' at the end: " + list);
 }
}