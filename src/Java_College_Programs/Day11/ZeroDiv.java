package Java_College_Programs.Day11;

import java.util.Scanner;

public class ZeroDiv {
    public static void main(String[] args) {
        double number1;
        double number2;
        double div;
        Scanner a1 = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        number1 = a1.nextDouble();
        System.out.print("Enter the second number: ");
        number2 = a1.nextDouble();

        try {
            if (number1 == number2) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }
            div = 30 / (number1 - number2);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("As the denominator goes to zero, replacing number2 (" + number2 + ") with 0.");
            number2 = 0;
            div = 30 / (number1 - number2);
        }
        System.out.println("Division result is: " + div);
    }
}

