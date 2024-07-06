package Java_College_Programs.Day5;

class StuDent{
    int roll;
    public void get_roll(int a){
        roll = a;
    }
    public void put_roll(){
        System.out.println("Roll: "+ roll);
    }

}

class Science extends StuDent{
    int m1, m2;
    public void get_marks(int a, int b){
        m1 = a;
        m2 = b;
    }
    public void put_marks(){
        System.out.println("Science:-");
        get_roll(1);
        get_marks(80,95);
        put_roll();
        System.out.println("Marks 1: "+ m1);
        System.out.println("Marks 2: "+ m2);
    }
}

class Arts extends StuDent{
    int m1, m2;
    public void get_marks(int a, int b){
        m1 = a;
        m2 = b;
    }
    public void put_marks(){
        System.out.println("Arts:-");
        get_roll(3);
        get_marks(90,85);
        put_roll();
        System.out.println("Marks 1: "+ m1);
        System.out.println("Marks 2: "+ m2);
    }
}

class HieInheritance{
    public static void main(String[] args){
        Science s1= new Science();
        Arts a1= new Arts();
        s1.put_marks();
        a1.put_marks();
    }
}