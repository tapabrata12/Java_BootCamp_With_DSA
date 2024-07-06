package Java_College_Programs.Day2;
import java.util.Scanner;

class Temperature {
  public static void main(String[] args) {

    Conversion obj = new Conversion();
    obj.get_data();
    obj.calculate();
  }
}

class Conversion {
  double cel, far;

  public void get_data() {
    Scanner a1 = new Scanner(System.in);
    System.out.print("Enter the value in Celsius: ");
    cel = a1.nextInt();
  }

  public void calculate() {
    far = 9 * cel / 5 + 32;
    System.out.println("Enter the value in Fahrenheit is: " + far);
  }
}