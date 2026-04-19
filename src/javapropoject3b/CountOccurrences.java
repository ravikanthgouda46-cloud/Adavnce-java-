package javapropoject3b;

// Q3b(Q2): Write a Java Program for counting how many times a substring
// appears in a main string using user defined function countOccurrences()

public class CountOccurrences {

    // User-defined function
    public static int countOccurrences(String mainStr, String subStr) {
        int count = 0;
        int index = 0;

        while ((index = mainStr.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length();
        }

        return count;
    }

    public static void main(String[] args) {

        String mainStr = "Java is fun. Java is powerful. Java is popular.";
        String subStr = "Java";

        int result = countOccurrences(mainStr, subStr);

        System.out.println("Main String: " + mainStr);
        System.out.println("Substring: " + subStr);
        System.out.println("Number of occurrences: " + result);
    }
}