package day2.Loops;

public class whileLoop {
    public static void main(String[] args) {
        /*
         * While Loop in Java: A Detailed Explanation
         * 
         * A while loop in Java is a control flow statement that repeatedly executes a
         * block of code as long as a given condition is true. It's a versatile tool for
         * iterative tasks where the number of iterations isn't known beforehand.
         * 
         * while (condition) {
         * / code to be executed
         * }
         */

        /*
         * How it Works:
         * 
         * Condition Check: The loop begins by evaluating the condition.
         * Code Execution: If the condition is true, the code inside the loop's body is
         * executed.
         * Loop Iteration: After executing the code, the condition is checked again.
         * Repeat: Steps 2 and 3 continue to repeat until the condition becomes false.
         */

         int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        /* Key Points to Remember:

            Infinite Loops: If the condition never becomes false, the loop will run indefinitely. This is often unintentional and can lead to program crashes. To avoid this, ensure that the condition will eventually become false within the loop's body.
            Initialization: The variable used in the condition should be initialized before the loop starts.
            Increment/Decrement: The variable should be incremented or decremented within the loop's body to modify the condition and eventually terminate the loop.
            Indentation: Proper indentation makes the code more readable and easier to understand. 
        
        */
    }
}
