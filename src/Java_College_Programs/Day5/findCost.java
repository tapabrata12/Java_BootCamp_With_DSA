package Java_College_Programs.Day5;
import java.util.*;

class cost
{
  int l, h, w, wArea, rArea;
  Scanner sc = new Scanner(System.in);

  public void getDimensions(){
      System.out.print("Eneter the length of the room: ");
      l =sc.nextInt();
      System.out.print("Eneter the height of the room: ");
      h =sc.nextInt();
      System.out.print("Eneter the width of the room: ");
      w =sc.nextInt();
      wArea = 2*(l + w)*h;
      rArea = l * h;
  }

  public void painting(){
      int p = (wArea+rArea)*25;
      System.out.println("The cost of painting the room including the roof(Rs 25/- per unit) is: Rs "+ p +"/-");
  }

  public void flooring(){
      int f = rArea*250;
      System.out.println("The cost of flooring the room with marble(Rs 250/- per unit) is: Rs "+ f +"/-");
  }

}

class findCost{
  public static void main(String args[]){
      cost c1 = new cost();
      c1.getDimensions();
      c1.painting();
      c1.flooring();
  }
}