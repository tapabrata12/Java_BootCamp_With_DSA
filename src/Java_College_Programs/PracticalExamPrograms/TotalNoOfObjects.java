
/*
The Object count is: 1
The Object count is: 2
The Object count is: 3
*/

package Java_College_Programs.PracticalExamPrograms;

class Object_Count {
    static int objCount;
    Object_Count(){
        objCount++;
        System.out.println("The Object count is: "+objCount);
    }
}
public class TotalNoOfObjects {
    public static void main(String[] args) {
            Object_Count a1 = new Object_Count();
            Object_Count a2 = new Object_Count();
            Object_Count a3 = new Object_Count();
    }
}
