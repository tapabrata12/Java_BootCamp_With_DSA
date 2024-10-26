package day1._1_Variables_and_Datatypes;

public class Datatype {
    public static void main(String[] args) {
        /* Datatypes are two types:
                1. Primitive
                2. Non-Primitive [ We will discuss later ]
        */

        /*
            Primitive:
                1. Numeric:
                    1. Integer:
                        1.byte
                        2.short
                        3.int
                        4.long

                     2. Decimal:
                        1.float
                        2.double

                2. Boolean:
                        1. True
                        2. False

                3. Character:
                        1. char
        */

        // Numeric

        byte byteNum = 99; // 1 byte max range
        System.out.println(byteNum);
        short shortNum = 9999; // 2 byte max range
        System.out.println(shortNum);
        int intNum = 999999999; // 4 byte max range
        System.out.println(intNum);
        long longNum = 999999999999999999L; // 8 byte max range
        System.out.println(longNum);

        // Decimal

        float floatNum = 1.566666666666666662f; // 4 bytes Takes only 7 digit precision
        System.out.println(floatNum);

        double doubleNum = 1.566666666666666662; // 8 bytes Takes 15 to 17 digit precision
        System.out.println(doubleNum);

        // Boolean

        boolean isRead = true; // 1 bit only stores true or false
        System.out.println(isRead);
        isRead = false;
        System.out.println(isRead);

        // Character

        char charWord = 'a';
        System.out.println(charWord);
        /*
        After Java version 10 there is a key word var which helps us to initialized dynamically types variable only in a method

        Comment out the bellow code snippet if you have java 10 above version install
        */

      /*       var name = "Hello";
               System.out.println(name);    */

    }
}
