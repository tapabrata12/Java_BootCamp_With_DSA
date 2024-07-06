package Java_College_Programs.Day9;

 interface AreaPerimeter {  // Interface name uses camelCase
    int CONSTANT = 4;  // Use final for constants

    void calculateArea();  // Abstract methods use camelCase

    void calculatePerimeter();
}

 class Calculate implements AreaPerimeter {
    @Override
    public void calculateArea() {
        int length = 10;  // Local variable for length
        int area = length * length;
        System.out.println("Area: " + area);
    }

    @Override
    public void calculatePerimeter() {
        int length = 10;  // Local variable for length
        int perimeter = CONSTANT * length;
        System.out.println("Perimeter: " + perimeter);
    }
}

class Main0 {
    public static void main(String[] args) {
        Calculate obj = new Calculate();  // Create an object of Calculate
        obj.calculateArea();
        obj.calculatePerimeter();
    }
}
