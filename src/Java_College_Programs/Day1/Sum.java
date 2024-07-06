package Java_College_Programs.Day1;

class Summation{
    int x,y;
    public void get_values(){
        x = 10;
        y = 20;
    }
    public void Sum(){
         int s = x + y;
         System.out.print("The sum of "+x+" and "+y+" is "+s);
    }
}
class Sum {
    public static void main(String[] args){
        // Now to use that class we have make an obj of that class

        /*
          Syntax:
          class_name obj = new class_name(); <-- this semicolon

        */
        Summation a = new Summation(); // Obj creation complete
        // Give the properties
        /*
         Syntax:
         Obj_name.Property_name;

        */
        a.get_values();
        a.Sum();
    }
}
