package _3_Literals;

public class Literals_intro {
    public static void main(String[] args) {
        // It is constants assigned to the variable (Identifiers)
        // Types of Literals

        // Numeric Literals
        /*               --> Integer
                                -> Binary
                                -> Decimal
                                -> Octal
                                -> Hexadecimal
        */

        int decimal = 123;
        System.out.println(decimal);
        int binary = 0b10110;
        System.out.println(binary);
        int octal = 075;
        System.out.println(octal);
        int hexadecimal = 0x1A5C;
        System.out.println(hexadecimal);

        /*
        Floating point number:
                --> float
                --> double
        */

        float number1 = 3.14f;
        System.out.println(number1);
        double number2 = 5.6666663;
        System.out.println(number2);
        // Character Literals (Represent single character in single quotes)
        char letterA = 'A';
        System.out.println(letterA);
        char digit5 = '5'; // We can write integer as character
        System.out.println(digit5);

        // String Literals (Represent multiple character in multi quotes)
        String letterC = "I am a boy";
        String empty = ""; // We can represent empty string

        // Boolean literals (Represent true or false)

        boolean isRaining = true;
        System.out.println(isRaining);
        boolean goOutside = false;
        System.out.println(goOutside);

        // Null literals (Null means nothing)

        String name = null;
        System.out.println(name);

    }
}
