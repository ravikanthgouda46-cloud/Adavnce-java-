package Javaproject3b;
import java.util.Scanner;

public class StringOperationsDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = new String("World");

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // 2. Length and Character Access
        System.out.println("\nLength of str1: " + str1.length());
        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

        // 3. String Comparison
        String s3 = "hello";
        System.out.println("\nEquals: " + str1.equals(s3));
        System.out.println("Equals Ignore Case: " + str1.equalsIgnoreCase(s3));

        // 4. String Searching
        String text = "Java Programming";
        System.out.println("\nIndex of 'Pro': " + text.indexOf("Pro"));
        System.out.println("Contains 'Java': " + text.contains("Java"));

        // 5. Substring Operations
        System.out.println("\nSubstring (0 to 4): " + text.substring(0, 4));

        // 6. String Modification
        String modified = text.replace("Java", "Python");
        System.out.println("\nAfter Replace: " + modified);
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());

        // 7. Whitespace Handling
        String strWithSpaces = "   Java Programming   ";
        System.out.println("\nTrimmed String: '" + strWithSpaces.trim() + "'");

        // 8. String Concatenation
        String concat = str1 + " " + str2;
        System.out.println("\nConcatenated String: " + concat);

        // 9. String Splitting
        String sentence = "Java,is,fun,to,learn";
        String[] words = sentence.split(",");
        System.out.println("\nSplitted Words:");
        for (String word : words) {
            System.out.println(word);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.insert(5, " Java");
        sb.replace(0, 5, "Hi");
        System.out.println("\nStringBuilder Result: " + sb);

        // 11. String Formatting
        String name = "John";
        int age = 22;
        String formatted = String.format("Name: %s, Age: %d", name, age);
        System.out.println("\nFormatted String: " + formatted);

        // 12. Email Validation
        System.out.print("\nEnter an email: ");
        String email = sc.nextLine();

        if (email.contains("@") && email.endsWith(".com") && !email.startsWith("@")) {
            System.out.println("Valid Email Format");
        } else {
            System.out.println("Invalid Email Format");
        }

        sc.close();
    }
}