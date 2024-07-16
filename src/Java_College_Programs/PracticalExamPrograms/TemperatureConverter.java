package Java_College_Programs.PracticalExamPrograms;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter temperature in Celsius
        System.out.println("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        // Convert Celsius to Fahrenheit
        double fahrenheit = convertCelsiusToFahrenheit(celsius);

        // Print the result
        System.out.printf("Temperature in Fahrenheit: %.2f°F%n", fahrenheit);

        scanner.close();
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (9.0 / 5.0) * celsius + 32;
    }
}

