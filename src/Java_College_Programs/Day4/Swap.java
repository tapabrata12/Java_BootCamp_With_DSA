package Java_College_Programs.Day4;
class Main {
  int num;

  // Constructor to assign value
  Main(int num) {
    this.num = num;
  }

  // Method to swap values
  public static void swap(Main s1, Main s2) {
    int temp = s1.num;
    s1.num = s2.num;
    s2.num = temp;
  }

  public static void main(String[] args) {
    Main s1 = new Main(10);
    Main s2 = new Main(20);

    System.out.println("Before Swap:");
    System.out.println("s1: " + s1.num);
    System.out.println("s2: " + s2.num);

    swap(s1, s2);

    System.out.println("After Swap:");
    System.out.println("s1: " + s1.num);
    System.out.println("s2: " + s2.num);
  }
}
