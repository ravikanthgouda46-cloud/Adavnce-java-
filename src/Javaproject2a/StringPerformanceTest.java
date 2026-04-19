
package Javaproject2a;

//Q2b: Develop a Java program to test performance of StringBuffer and StringBuilder

public class StringPerformanceTest {
 public static void main(String[] args) {

     int iterations = 10000;

     // StringBuffer Test
     StringBuffer sbf = new StringBuffer();
     long startTime1 = System.currentTimeMillis();

     for (int i = 0; i < iterations; i++) {
         sbf.append("AIET");
     }

     long endTime1 = System.currentTimeMillis();
     System.out.println("StringBuffer Time: " + (endTime1 - startTime1) + " ms");

     // StringBuilder Test
     StringBuilder sbd = new StringBuilder();
     long startTime2 = System.currentTimeMillis();

     for (int i = 0; i < iterations; i++) {
         sbd.append("AIET");
     }

     long endTime2 = System.currentTimeMillis();
     System.out.println("StringBuilder Time: " + (endTime2 - startTime2) + " ms");

     // Comparison
     if ((endTime1 - startTime1) > (endTime2 - startTime2)) {
         System.out.println("StringBuilder is faster than StringBuffer");
     } else {
         System.out.println("StringBuffer is faster or equal to StringBuilder");
     }
 }
}