package Java_College_Programs.Day1;


class Fact{
    int i,n,fact = 1;
    public void Assign_Range(){
        n = 5;
    }
    public void Factorial_Result(){
        for(i = 1; i <= n; i++){
            fact = fact * i;
        }
        System.out.println("The factorial of "+n+" is "+fact);
    }
}
class Factorial {
    public static void main(String[] args){
        Fact a = new Fact();
        a.Assign_Range();
        a.Factorial_Result();
    }
}
