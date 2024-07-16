package Java_College_Programs.PracticalExamPrograms;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the first number
        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Prompt user to enter the second number
        System.out.println("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Prompt user to enter the operation
        System.out.println("Enter the operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        double result;

        // Perform the operation using a switch case
        switch (operation) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Error: Invalid operation.");
                break;
        }

        scanner.close();
    }
}