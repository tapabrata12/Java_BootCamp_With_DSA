package Java_College_Programs.PracticalExamPrograms;

import java.util.Scanner;

public class AreaCalculator {

    // Method to calculate the area of a rectangle
    public double calculateArea(double length, double width) {
        return length * width;
    }

    // Overloaded method to calculate the area of a square
    public double calculateArea(double side) {
        return side * side;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AreaCalculator calculator = new AreaCalculator();

        // Taking user input for the dimensions of the rectangle
        System.out.println("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        // Taking user input for the dimension of the square
        System.out.println("Enter the side of the square: ");
        double side = scanner.nextDouble();

        // Calculating the areas
        double rectangleArea = calculator.calculateArea(length, width);
        double squareArea = calculator.calculateArea(side);

        // Printing the results
        System.out.println("Area of the rectangle: " + rectangleArea);
        System.out.println("Area of the square: " + squareArea);

        scanner.close();
    }
}
