package Java_College_Programs.Day8;
abstract class X {
    public X() {
        System.out.println("This will must Inherit");
        System.out.print("I am: ");
    }
}

class Y extends X_1 {
    public void Print() {
        System.out.print("Tapabrata");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Y_1 a1 = new Y_1();
        a1.Print();
    }

}
