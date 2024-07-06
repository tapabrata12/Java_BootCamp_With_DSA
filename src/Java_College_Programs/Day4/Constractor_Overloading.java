// Write a program to show constructor overloading
package Java_College_Programs.Day4;
import java.util.Scanner;
class Add{

  int x,y;

   Add(int a,int b){
     x = a;
     y = b;
     System.out.println("User defined value for x is "+x+" and for y is "+y);
  }

  Add(int a){

    x = a;
    Scanner a1 = new Scanner(System.in);
     System.out.println("Grabbing value for second constructor");
    System.out.println("Enter the number: ");
    y = a1.nextInt();
    
  }

  Add(){
    Scanner a2 = new Scanner(System.in);
     System.out.println("Grabbing value for third constructor");
    System.out.println("Enter the number: ");
    x = a2.nextInt();
    System.out.println("Enter the number: ");
    y = a2.nextInt();
    
  }

  public void sum(){
   int sum = x + y;
    System.out.println("The sum is: "+sum);
  }
}


class Main3{
  public static void main(String[] args){
        Add M1 = new Add(2,3);
        Add M2 = new Add(10);
        Add M3 = new Add();
    M1.sum();
    M2.sum();
    M3.sum();
  }
}