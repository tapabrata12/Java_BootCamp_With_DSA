import java.io.*;

public class Methord_overloading_inheritance {
  public static void main(String[] args) {
    Dog a = new Dog();
    a.X("ParentClass");
    a.X();
  }
}

class Animal {

  public void X(String animal) {
    System.out.println("Animal");
  }
}

class Dog extends Animal {
  public void X() {
    System.out.println("Dog");
  }
}
