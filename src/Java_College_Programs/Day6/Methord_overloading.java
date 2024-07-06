import java.io.*;
import java.util.Scanner;

class Add {
  int x, y;

  public

      void getdata() {
    Scanner x1 = new Scanner(System.in);
    System.out.print("Enter the number: ");
    x = x1.nextInt();
    System.out.print("Enter the number: ");
    y = x1.nextInt();
  }

  void getdata(int a, int b) {
    x = a;
    y = b;
  }

  void Sum() {
    int sum = x + y;
    System.out.println("The sum is: " + sum);
  }
}

class Method_overloading {

  public static void main(String[] args) {
    Add obj = new Add();
    obj.getdata(5, 10);
    obj.Sum();
    obj.getdata();
    obj.Sum();
  }
}