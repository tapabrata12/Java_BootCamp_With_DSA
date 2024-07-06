package Java_College_Programs.Day4;
class Test {
  // Static variable to store the count of objects created
  private static int objectCount = 0;

  // Constructor that increments the objectCount each time a new object is created
  public Test() {
    objectCount++;
  }

  // Static method to get the current count of objects
  public static int getObjectCount() {
    return objectCount;
  }
}

class Main4 {
  public static void main(String[] args) {
    // Creating objects
    Test obj1 = new Test();
    Test obj2 = new Test();
    Test obj3 = new Test();

    // Displaying the number of objects created
    System.out.println("Total number of objects created: " + Test.getObjectCount());
  }
}
