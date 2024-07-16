package Java_College_Programs.PracticalExamPrograms;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class DynamicMethodDispatchDemo {
    public static void main(String[] args) {
        // Reference variable of type Animal, but object of type Dog
        Animal myAnimal = new Dog();
        myAnimal.sound(); // Outputs "Dog barks"

        // Reference variable of type Animal, but object of type Cat
        myAnimal = new Cat();
        myAnimal.sound(); // Outputs "Cat meows"
    }
}

