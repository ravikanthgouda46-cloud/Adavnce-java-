package Javaproject1c;

//Q1c(1): Write a Java program to iterate through all elements in a linked list
//starting at the specified position (2nd) using iterator

import java.util.*;

public class LinkedListIteratorPosition {
 public static void main(String[] args) {

     // Creating LinkedList
     LinkedList<String> list = new LinkedList<>();

     // Adding elements
     list.add("Apple");
     list.add("Banana");
     list.add("Orange");
     list.add("Mango");

     // Display original list
     System.out.println("LinkedList: " + list);

     // Creating iterator starting from index 1 (2nd position)
     ListIterator<String> iterator = list.listIterator(1);

     System.out.println("Elements from 2nd position:");

     // Iterating
     while (iterator.hasNext()) {
         System.out.println(iterator.next());
     }
 }
}
