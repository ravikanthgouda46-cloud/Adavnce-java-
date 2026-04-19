// Q1a: Develop a Java program for adding elements [Apple, Banana, Orange]
// into an ArrayList and a LinkedList and perform various operations.

package Javaproject1a;

import java.util.*;

public class ListOperations {
 public static void main(String[] args) {

     // Creating ArrayList and LinkedList
     ArrayList<String> arrayList = new ArrayList<>();
     LinkedList<String> linkedList = new LinkedList<>();

     // 1. Adding elements
     arrayList.add("Apple");
     arrayList.add("Banana");
     arrayList.add("Orange");

     linkedList.add("Apple");
     linkedList.add("Banana");
     linkedList.add("Orange");

     System.out.println("Initial ArrayList: " + arrayList);
     System.out.println("Initial LinkedList: " + linkedList);

     // 2. Adding element at specific index
     arrayList.add(1, "Mango");
     System.out.println("\nAfter adding Mango at index 1: " + arrayList);

     // 3. Adding multiple elements
     arrayList.addAll(Arrays.asList("Grapes", "Pineapple"));
     System.out.println("After adding multiple elements: " + arrayList);

     // 4. Accessing elements
     System.out.println("\nElement at index 0: " + arrayList.get(0));

     // 5. Updating elements
     arrayList.set(1, "Kiwi");
     System.out.println("After updating index 1 to Kiwi: " + arrayList);

     // 6. Removing elements
     arrayList.remove("Orange");
     System.out.println("\nAfter removing Orange: " + arrayList);

     // 7. Searching elements
     System.out.println("Is Apple present? " + arrayList.contains("Apple"));

     // 8. List size
     System.out.println("Size of ArrayList: " + arrayList.size());

     // 9. Iterating using for-each loop
     System.out.println("\nIterating using for-each:");
     for (String item : arrayList) {
         System.out.println(item);
     }

     // 10. Using Iterator
     System.out.println("\nIterating using Iterator:");
     Iterator<String> iterator = arrayList.iterator();
     while (iterator.hasNext()) {
         System.out.println(iterator.next());
     }

     // 11. Sorting
     Collections.sort(arrayList);
     System.out.println("\nAfter sorting: " + arrayList);

     // 12. Sublist
     System.out.println("Sublist (0 to 2): " + arrayList.subList(0, 2));

     // 13. Clearing the list
     arrayList.clear();
     System.out.println("\nAfter clearing ArrayList: " + arrayList);
 }
}