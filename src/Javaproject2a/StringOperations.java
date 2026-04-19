package Javaproject2a;

// Q2a: Develop a Java program for performing various string operations

import java.util.*;

public class StringOperations {
    public static void main(String[] args) {

        // 1. String Creation
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "   Java Programming   ";

        System.out.println("Original Strings:");
        System.out.println(str1 + " " + str2);

        // 2. Length and Character Access
        System.out.println("\nLength of str1: " + str1.length());
        System.out.println("Character at index 1: " + str1.charAt(1));

        // 3. String Comparison
        System.out.println("\nComparing strings:");
        System.out.println("str1 equals str2? " + str1.equals(str2));
        System.out.println("str1 equalsIgnoreCase 'hello'? " + str1.equalsIgnoreCase("hello"));

        // 4. String Searching
        System.out.println("\nSearching:");
        System.out.println("Index of 'o' in str1: " + str1.indexOf('o'));
        System.out.println("Contains 'Java'? " + str3.contains("Java"));

        // 5. Substring
        System.out.println("\nSubstring:");
        System.out.println("Substring of str1 (1 to 4): " + str1.substring(1, 4));

        // 6. String Modification
        System.out.println("\nModification:");
        System.out.println("Replace 'Hello' with 'Hi': " + str1.replace("Hello", "Hi"));
        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Lowercase: " + str2.toLowerCase());

        // 7. Whitespace Handling
        System.out.println("\nTrimmed string:");
        System.out.println(str3.trim());

        // 8. String Concatenation
        String combined = str1.concat(" ").concat(str2);
        System.out.println("\nConcatenated String: " + combined);

        // 9. String Splitting
        String sentence = "Java is fun to learn";
        String[] words = sentence.split(" ");

        System.out.println("\nSplitting sentence:");
        for (String word : words) {
            System.out.println(word);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming");
        System.out.println("\nStringBuilder result: " + sb);

        // 11. String Formatting
        int num = 100;
        String formatted = String.format("Number is: %d", num);
        System.out.println("\nFormatted String: " + formatted);

        // 12. Email Validation
        String email = "example@gmail.com";

        if (email.contains("@") && email.startsWith("example") && email.endsWith(".com")) {
            System.out.println("\nValid Email");
        } else {
            System.out.println("\nInvalid Email");
        }
    }
}