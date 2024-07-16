package Java_College_Programs.PracticalExamPrograms;

// Superclass
class Ani {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Subclass
class D extends Ani {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class SingleInheritanceExample {
    public static void main(String[] args) {
        // Create an instance of Dog
        D dog = new D();

        // Call methods from both Dog and Animal classes
        dog.eat();  // Inherited method
        dog.bark(); // Method from Dog class
    }
}

