package Java_College_Programs.Day12;

class A1 extends Thread{
    public void run(){
        for(int i = 1; i<=5; i++){
            System.out.println("\t From Thread A: i = " + i);
        }
        System.out.println("Exit from A");
    }
}

class B1 extends Thread{
    public void run(){
        for(int j = 1; j<=5; j++){
            System.out.println("\t From Thread B: i = " + j);
        }
        System.out.println("Exit from B");
    }
}

class C1 extends Thread{
    public void run(){
        for(int k = 1; k<=5; k++){
            System.out.println("\t From Thread C: i = " + k);
        }
        System.out.println("Exit from C");
    }
}

public class Thread1 {
    public static void main(String[] args) {
        new A1().start();
        new B1().start();
        new C1().start();
    }
}