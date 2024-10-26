package day1._1_Variables_and_Datatypes;

public class Variable {
    public static void main(String[] args) {
        // Variable is an entity which stores value / data with a particular types of it

        /* Two types of variable exists

            1. Weak type variable / Dynamic type datatype [No need to mention the datatype at compile time]
            2. Strong type variable / Static type datatype [Need to mention the datatype at compile time]

        */

        // Java follows strong type of datatype.

        //  datatype variable_name = value;
        int a = 1;
        System.out.println(a);

        // We can't store different types of data in a particular type of variable that will give error

    /*
        a = 5.6;
        System.out.println(a);
        Error: java: incompatible types: possible lossy conversion from double to int
    */

        // We can also write variables in 2 steps
        int b; // 1. Declaration
        b = 10;// 2. Initialisation


        System.out.println(b);

        // Naming of variables:
                /*
                Rules: 1. We are allowed to use a - z / A - Z / 0 - 9 / $ / _
                       2. For first character use a - z / A - Z / $ / _
                       3. Can't use reserve keywords
                       4. Case-sensitive language means int a not equals to int A
                       5. Space between name not allowed:
                            int a b = 1;
                            Error: java: ';' expected

                Recommendations:
                        1. Should starts with small case [int Name;❌ int name;]
                        2. Use camel case [int firstName;]
                */
    }
}
