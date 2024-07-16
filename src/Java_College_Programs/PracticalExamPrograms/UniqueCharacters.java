package Java_College_Programs.PracticalExamPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a string
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        // Call the method to print unique characters
        printUniqueCharacters(input);

        scanner.close();
    }

    // Method to print unique characters in the string
    public static void printUniqueCharacters(String input) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Count the occurrences of each character
        for (char ch : input.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Print characters that appear only once
        System.out.println("Unique characters:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}

