package Java_College_Programs.Day8;
class X_1 {
  int a = 4;
  final int b = 10;
  // The following line will cause a compilation error:
  // b = 20;
}

class Y_1 extends X_1 {
  public void Print() {
    System.out.println("Printing A variable: ");
    System.out.println(a);
    System.out.println("Printing B variable: ");
    System.out.println(b);
  }
}

class Final {
  public static void main(String[] args) {
    Y_1 a1 = new Y_1();
    a1.Print();
  }
}
