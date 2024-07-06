package Java_College_Programs.Day3;
import java.util.Scanner;

class print {
  Scanner sc = new Scanner(System.in);

  // 1. Floyd Triangle with Stars.
  public void StarFloydTriangle() {
    System.out.print("Enter the no. lines: ");
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

  }

  // 2. Reverse Floyd Triangle with Stars.
  public void ReverseStarFloydTriangle() {
    System.out.print("Enter the no. lines: ");
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
      for (int j = n; j >= i; j--) {
        System.out.print("*");
      }
      System.out.println();
    }

  }

  // 3. Reverse Numbers Floyd Triangle.
  public void ReverseNumbersFloydTriangle() {
    System.out.print("Enter the no. lines: ");
    int n = sc.nextInt();
    for (int i = n; i >= 1; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j);
      }
      System.out.println();
    }

  }

  // 4. Reverse Numbers Floyd Triangle starting with the last number.
  public void ReverseNumbersTriangle() {
    System.out.print("Enter the no. lines: ");
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
      for (int j = n; j >= i; j--) {
        System.out.print(j);
      }
      System.out.println();
    }

  }

  // 5. Reverse Numbers Floyd Triangle with the same numbers as the line.
  public void ReverseSameNumbersTriangle() {
    System.out.print("Enter the no. lines: ");
    int n = sc.nextInt();
    for (int i = n; i >= 1; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print(i);
      }
      System.out.println();
    }

  }

  // 6. Numbers Floyd Triangle with the same numbers as the line.
  public void SameNumbersTriangle() {
    System.out.print("Enter the no. lines: ");
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(i);
      }
      System.out.println();
    }

  }

  // 7. Diagonal with Stars.
  public void StarsDiagonal() {
    System.out.print("Enter the no. lines: ");
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        if (j == i) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }

      }
      System.out.println();
    }

  }

  // 8. Floyd Triangle with Increasing Numbers.
  public void TriangleWithIncreasingNumber() {
    System.out.print("Enter the no. lines: ");
    int n = sc.nextInt();
    int k = 1;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(k + " ");
        k++;
      }
      System.out.println();
    }

  }

  // 9. Hollow Rectangle.
  public void HollowRectangle() {
    System.out.print("Enter the no. lines: ");
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        if (i == 1 || i == n || j == 1 || j == n) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }

  }

  // 10. Stars Pyramid.
  public void StarsPyramid() {
    System.out.print("Enter the no. lines: ");
    Scanner sc = new Scanner(System.in);
    int rows = sc.nextInt();

    for (int i = 0; i < rows; i++) {
      // Print spaces
      for (int j = 0; j < rows - i - 1; j++) {
        System.out.print(" ");
      }

      // Print stars
      for (int k = 0; k <= i; k++) {
        System.out.print("* ");
      }

      // Move to the next line
      System.out.println();
    }
  }
}

class Patterns {
  public static void main(String[] args) {
    print a1 = new print();
    a1.StarFloydTriangle();
    a1.ReverseStarFloydTriangle();
    a1.ReverseNumbersFloydTriangle();
    a1.ReverseNumbersTriangle();
    a1.ReverseSameNumbersTriangle();
    a1.SameNumbersTriangle();
    a1.StarsDiagonal();
    a1.TriangleWithIncreasingNumber();
    a1.HollowRectangle();
    a1.StarsPyramid();
  }
}