package Javaproject1c;

//Q1c(2): Write a Java program to iterate a linked list in reverse order
//using descendingIterator()

import java.util.*;

public class LinkedListReverse {
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

     // Reverse iteration using descendingIterator
     Iterator<String> iterator = list.descendingIterator();

     System.out.println("Reverse order:");

     while (iterator.hasNext()) {
         System.out.println(iterator.next());
     }
 }
}