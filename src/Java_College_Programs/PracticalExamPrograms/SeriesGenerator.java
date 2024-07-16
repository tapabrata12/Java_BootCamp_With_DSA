package Java_College_Programs.PracticalExamPrograms;

import java.util.Scanner;

public class SeriesGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the number of terms
        System.out.println("Enter the number of terms to print in the series: ");
        int n = scanner.nextInt();

        int currentNumber = 1;

        for (int i = 0; i < n; i++) {
            // Print the current number
            System.out.print(currentNumber + " ");

            // Update the current number for the next iteration
            // If current number is positive, make the next number negative, and vice versa
            if (currentNumber > 0) {
                currentNumber = -currentNumber - 2; // Make it negative and increase by 2
            } else {
                currentNumber = -currentNumber + 2; // Make it positive and increase by 2
            }
        }

        scanner.close();
    }
}

