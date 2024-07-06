package Java_College_Programs.Day9;

class GrandParent {
    public GrandParent() {
        System.out.println("GrandParent constructor");
    }
}

class Parent extends GrandParent {
    public Parent() {
        super(); // Call GrandParent constructor
        System.out.println("Parent constructor");
    }
}

class Child extends Parent {
    public Child() {
        super(); // Call Parent constructor
        System.out.println("Child constructor");
    }
}

 class Main2 {
    public static void main(String[] args) {
        Child obj = new Child();
    }
}
