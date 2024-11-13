package day2.Conditions;

public class Switch {
    public static void main(String[] args) {
        /*
         * The switch statement in Java is a control flow statement that allows you to
         * execute different code blocks based on the value of an expression. It's
         * particularly useful when you need to make decisions based on a finite number
         * of possible values.
         * 
         * Basic Syntax:
         */

        /*
         * switch(expression) {
         * case value1:
         * // Code to be executed if expression == value1
         * break;
         * case value2:
         * // Code to be executed if expression == value2
         * break;
         * // ...
         * default:
         * // Code to be executed if expression doesn't match any case
         * }
         */

        /*
         * How it Works:
         * 
         * Expression Evaluation: The expression inside the parentheses is evaluated.
         * Case Matching: The result of the expression is compared to each case label.
         * Code Execution: If a match is found, the code block associated with that case
         * is executed.
         * break Statement: The break statement is crucial to prevent the program from
         * falling through to the next case after a match. If break is omitted, the
         * program will continue executing the code blocks of subsequent cases until it
         * encounters a break or the end of the switch block.
         * default Case: The default case is optional. It's executed if none of the case
         * labels match the expression.
         */

        int day = 5;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }

        /*
         * Key Points:
         * 
         * The expression must evaluate to a value of a type that can be compared using
         * the == operator. Common types include int, char, byte, short, and String, wraper classes, enums.
         * The case labels must be constant expressions.
         * The break statement is optional but highly recommended to prevent unintended
         * fall-through behavior.
         * The default case is optional and is executed if no case matches.
         * You can use String values in switch statements since Java 7.
         * The switch statement can be used to create more complex decision-making
         * structures, such as nested switch statements.
         */
    }
}
