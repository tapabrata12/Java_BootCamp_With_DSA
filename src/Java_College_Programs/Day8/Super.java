import java.io.*;

class X {
  int length, breath;

  public X(int l, int b) {
    length = l;
    breath = b;
  }
}

class Y extends X {
  int height;

  public Y(int l, int b, int h) {
    super(l, b);
    height = h;
  }

  public void area() {
    int a;
    a = length * breath * height;
    System.out.println("Area: " + a);
  }
}

class Super {
  public static void main(String[] args) {
    Y y1 = new Y(10, 12, 8);
    y1.area();
  }
}