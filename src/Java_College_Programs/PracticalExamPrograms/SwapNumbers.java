package Java_College_Programs.PracticalExamPrograms;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter two numbers
        System.out.println("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int b = scanner.nextInt();

        // Swapping numbers
        a = a + b; // Step 1: a becomes the sum of a and b
        b = a - b; // Step 2: b becomes the original value of a
        a = a - b; // Step 3: a becomes the original value of b

        // Print the result
        System.out.println("After swapping:");
        System.out.println("First number: " + a);
        System.out.println("Second number: " + b);

        scanner.close();
    }
}

