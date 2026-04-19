package Javaproject3c;

//Q3c(Q9): Write a Java Program for creating a random string of a specified length
//using user defined function generateRandomString()

import java.util.Random;

public class RandomStringGenerator {

 // User-defined function
 public static String generateRandomString(int length) {

     String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
     String result = "";

     Random random = new Random();

     for (int i = 0; i < length; i++) {
         int index = random.nextInt(characters.length());
         result += characters.charAt(index);
     }

     return result;
 }

 public static void main(String[] args) {

     int length = 10;

     String randomString = generateRandomString(length);

     System.out.println("Random String: " + randomString);
 }
}