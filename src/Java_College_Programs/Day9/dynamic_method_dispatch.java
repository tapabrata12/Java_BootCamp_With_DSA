package Java_College_Programs.Day9;
// Parent class
class Sha_pe {
 double calculateArea() {
  return 0.0;
 }
}

// Child class 1
class Cir_cle extends Sha_pe {
 double radius;

 Cir_cle(double radius) {
  this.radius = radius;
 }

 @Override
 double calculateArea() {
  return Math.PI * radius * radius;
 }
}

// Child class 2
class Square extends Sha_pe {
 double side;

 Square(double side) {
  this.side = side;
 }

 @Override
 double calculateArea() {
  return side * side;
 }
}

// Child class 3
class Triangle extends Sha_pe {
 double base;
 double height;

 Triangle(double base, double height) {
  this.base = base;
  this.height = height;
 }

 @Override
 double calculateArea() {
  return 0.5 * base * height;
 }
}

class Main1 {
 public static void main(String[] args) {
  Sha_pe shape1 = new Cir_cle(5); // Creating Circle object with radius 5
  Sha_pe shape2 = new Square(4); // Creating Square object with side 4
  Sha_pe shape3 = new Triangle(3, 6); // Creating Triangle object with base 3 and height 6

  System.out.println("Area of Circle: " + shape1.calculateArea());
  System.out.println("Area of Square: " + shape2.calculateArea());
  System.out.println("Area of Triangle: " + shape3.calculateArea());
 }
}
