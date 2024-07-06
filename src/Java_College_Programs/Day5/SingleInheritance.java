package Java_College_Programs.Day5;

class Stu_dent {
    int roll;

    public void Get_roll(int a) {
        roll = a;
    }

    public void Put_roll() {
        System.out.println("Roll: " + roll);
    }

}

class Test1 extends Stu_dent {
    int m1, m2;

    public void Get_marks(int a, int b) {
        m1 = a;
        m2 = b;
    }

    public void Put_marks() {
        System.out.println("Marks 1: " + m1);
        System.out.println("Marks 2: " + m2);
    }

}

class SingleInheritance {
    public static void main(String[] args) {
        Test1 t1 = new Test1();
        t1.Get_roll(1);
        t1.Get_marks(80, 95);
        t1.Put_roll();
        t1.Put_marks();
    }
}