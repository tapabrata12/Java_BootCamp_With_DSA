package Java_College_Programs.Day2;
import java.util.Scanner;

class Area{
  public static void main(String[] args){
    Circle obj = new Circle();
    obj.get_data();
    obj.calculate();
  }
}

class Circle{
  double r;
  double pi= 3.14;
  public void get_data(){
    Scanner a1 = new Scanner(System.in);
    System.out.print("Enter radious: ");
    r = a1.nextFloat();
    
  }
  public void calculate(){
    double Area = pi*r*r;
    System.out.println("Area: "+Area);
  }
}