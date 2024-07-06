package Java_College_Programs.Day2;
import java.util.Scanner;

class Ori {
  public static void main(String[] args) {
    Sub obj = new Sub();
    obj.get_data();
    obj.calculate();
  }
}

class Sub {
  int num1, num2, sub, add, mul, div;

  public void get_data() {
    Scanner a1 = new Scanner(System.in);
    System.out.print("Enter the first value: ");
    num1 = a1.nextInt();
    System.out.print("Enter the second value: ");
    num2 = a1.nextInt(); // Corrected variable assignment
  }

  public void calculate() {
    sub = num1 - num2;
    add = num1 + num2;
    mul = num1 * num2;
    div = num1 / num2;
    System.out.println("Answer of addition is: " + add);
    System.out.println("Answer of subtraction is: " + sub);
    System.out.println("Answer of multiplication is: " + mul);
    System.out.println("Answer of division is: " + div);
  }
}
