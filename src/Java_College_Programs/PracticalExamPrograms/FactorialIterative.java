package Java_College_Programs.PracticalExamPrograms;

import java.util.Scanner;

public class FactorialIterative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        // Calculate factorial
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        // Print the result
        System.out.println("The factorial of " + number + " is: " + factorial);

        scanner.close();
    }
}

