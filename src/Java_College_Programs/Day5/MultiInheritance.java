package Java_College_Programs.Day5;
import java.util.*;

class Student {
    int roll;

    public void getroll(int a) {
        roll = a;
    }

    public void putroll() {
        System.out.println("Roll: " + roll);
    }

}

class Test extends Student {
    int m1, m2;

    public void getmarks(int a, int b) {
        m1 = a;
        m2 = b;
    }

    public void putmarks() {
        System.out.println("Marks 1: " + m1);
        System.out.println("Marks 2: " + m2);
    }

}

class Result extends Test {
    int total;

    public void display() {
        getroll(1);
        getmarks(90, 95);
        total = m1 + m2;
        putroll();
        putmarks();
        System.out.println("Total Marks: " + total);
    }
}

class MultiInheritance {
    public static void main(String args[]) {
        Result r1 = new Result();
        r1.display();
    }
}