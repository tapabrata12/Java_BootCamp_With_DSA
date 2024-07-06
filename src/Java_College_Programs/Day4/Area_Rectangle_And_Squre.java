package Java_College_Programs.Day4;

import java.util.Scanner;

class Area_Rectangle_And_Square {
  int x, y, r, s;

  // Constructor for calculating square area
  Area_Rectangle_And_Square() {
    System.out.print("Enter the side of a Square: ");
    Scanner a1 = new Scanner(System.in);
    x = a1.nextInt();

    s = x * x;
    System.out.println("Area of a Square: " + s);
  }

  // Constructor for calculating rectangle area
  Area_Rectangle_And_Square(int length, int width) {
    x = length;
    y = width;
    r = x * y;
    System.out.println("Area of rectangle: " + r);
  }
}

 class Main1 {
  public static void main(String[] args) {
    // Create an object for square
    Area_Rectangle_And_Square square = new Area_Rectangle_And_Square();

    // Create an object for rectangle
    System.out.print("Enter the length of a Rectangle: ");
    Scanner scanner = new Scanner(System.in);
    int length = scanner.nextInt();
    System.out.print("Enter the width of a Rectangle: ");
    int width = scanner.nextInt();
    Area_Rectangle_And_Square rectangle = new Area_Rectangle_And_Square(length, width);
  }
}
