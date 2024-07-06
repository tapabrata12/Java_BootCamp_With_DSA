package Java_College_Programs.Day9;

class Animal {
    protected String name; // Protected access allows access from subclasses
  
    public Animal(String name) {
      this.name = name;
    }
  
    public void greet() {
      System.out.println("Hello, my name is " + name);
    }
  }
  
  class Dog extends Animal {
    private final String breed;
  
    public Dog(String name, String breed) {
      super(name); // Call parent constructor using super()
      this.breed = breed;
    }
  
    public void bark() {
      System.out.println(name + " says Woof!");
    }
  
    @Override // Override greet() to add specific message for Dog
    public void greet() {
      super.greet(); // Call parent class greet() using super
      System.out.println("I am a " + breed + " dog.");
    }
  }
  
  
class Main4{
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", "Golden Retriever");
        dog.greet(); // Calls overridden greet() in Dog
        dog.bark();
      }
}