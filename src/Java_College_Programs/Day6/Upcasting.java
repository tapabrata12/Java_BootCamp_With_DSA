import java.io.*;

class ParentClass {
  public void print() {
    System.out.print("Parent class");
  }
}

class ChildClass extends ParentClass{
  public void print() {
    System.out.print("Child class");
  }
}

public class Upcasting {
  public static void main(String[] args) {
    ParentClass  x1 = new ChildClass();
    x1.print();
    
  }
}