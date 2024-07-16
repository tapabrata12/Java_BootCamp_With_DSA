package Java_College_Programs.PracticalExamPrograms;

import java.util.Scanner;

public class AbbreviatedForm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a string
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        // Call the method to get the abbreviated form
        String abbreviation = getAbbreviatedForm(input);

        // Print the result
        System.out.println("Abbreviated form: " + abbreviation);

        scanner.close();
    }

    // Method to get the abbreviated form of a string
    public static String getAbbreviatedForm(String input) {
        StringBuilder abbreviation = new StringBuilder();

        // Split the input string into words
        String[] words = input.split(" ");

        // Loop through each word and append the first letter to the abbreviation
        for (String word : words) {
            if (!word.isEmpty()) {
                abbreviation.append(word.charAt(0));
            }
        }

        return abbreviation.toString().toUpperCase(); // Convert to uppercase
    }
}
// Enter a string:
//World Health Organization
//Abbreviated form: WHO
