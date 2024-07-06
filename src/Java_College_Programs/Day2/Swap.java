package Java_College_Programs.Day2;
import java.util.Scanner;

class Swap {
  public static void main(String[] args) {

    Convert obj = new Convert();
    obj.get_data();
    obj.Swapping();
  }
}

class Convert {
  int a, b;

  public void get_data() {
    Scanner a1 = new Scanner(System.in);
    System.out.print("Enter the first value: ");
    a = a1.nextInt();
    System.out.print("Enter the second value: ");
    b = a1.nextInt();

    System.out.println("The value of a is: " + a);
    System.out.println("The value of b is: " + b);
    System.out.println("After swapping");
  }

  public void Swapping() {
    a = (a + b) - (b = a);
    System.out.println("The value of a is: " + a);
    System.out.println("The value of b is: " + b);
  }
}