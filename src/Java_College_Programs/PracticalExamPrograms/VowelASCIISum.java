package Java_College_Programs.PracticalExamPrograms;

import java.util.Scanner;

public class VowelASCIISum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a string
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        // Calculate the sum of ASCII values of all vowels
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (isVowel(ch)) {
                sum += (int) ch; // Add ASCII value of the vowel to the sum
            }
        }

        // Print the result
        System.out.println("The sum of ASCII values of all vowels in the string is: " + sum);

        scanner.close();
    }

    // Method to check if a character is a vowel
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
