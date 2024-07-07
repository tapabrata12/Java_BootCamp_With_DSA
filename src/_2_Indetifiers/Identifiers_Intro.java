package _2_Indetifiers;
import java.io.*;
 class Identifiers_Intro{
     public static void main(String[] args) {
         // Identifier is a name assigned to the programming elements like variables, method class , interfaces.

         /*
         Declaration: [ Datatype Identifier  = Literals; ] Semicolon is the special symbol to end a statement
         */

         int a = 10;
         System.out.println(a);

         /*
         Rules:
          Identifiers should not be started with any numbers.
          Identifiers may be started with an alphabet, '_' symbol, '$' symbols
         */

         int _a = 100;
         System.out.println(_a);

         int $alary = 50000;

         System.out.println($alary);

//         int 6a = 50; -> Error

         /*
         Examples of valid Identifiers:

         1. userName
         2. calculateSum
         3. _counter
         4. $totalAmount
         5. studentInfo
         6. MAX_VALUE
         7. isPrime
         8. userInput
         9. PI
         10. Book
         */

         /*
         Examples of invalid Identifiers:

         11. 123numbers (Starts with a digit)
         12. my-variable (Contains a hyphen)
         13. n@me (Contains a special character)
         14. class (Reserved keyword)
         15. 3DArray (starts with digit)
         16. my space (contains a whitespace)
         17. void (reserved keyword)
         18. if (reserved keyword)
         19. @Symbol (Special charecter)
         20. return (reserved keyword)
         */
        int salary = 1000; // (Valid)
//        int 11salary = 555;  (Invalid)
        String _addr = "Agra"; // (Valid)
        float $sal = 10000.0f; // (Valid)
        String student11No = "V1243-1111"; // (Valid)
        String std_Name = "Tapabrata Chowdhury"; // (Valid)
        float emp$Sal = 50000.0f;  // (Valid)

         /*
         Note: Identifiers are not allowing all operators and all special symbols except '_' and '$'
         Note: Identifiers are not allowing spaces in the middle.
         Note: In Java application we can use all predefine class name and interfaces names as identifiers
         */

         String Exception = "Error";
         System.out.println(Exception);

//    Note: Java is case-sensitive language.
         int B = 1;
         int b = 1;
//         both are different
         // Good practices for writing Identifiers is 'Camel Case'
         String yourName = "Tapabrata Chowdhury";
         System.out.println(yourName);
     }
}
