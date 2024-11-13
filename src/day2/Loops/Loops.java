package day2.Loops;

public class Loops {

   public static void main(String[] args) {
        /*
       * 
       * A **loop** in programming is a control structure that repeats a block of code
       * as long as a specified condition is true. Loops help automate repetitive
       * tasks, making code more efficient and readable.
       * 
       * ### Key Aspects of Loops:
       * 1. **Initialization**: Sets up any variables needed before starting the loop.
       * 2. **Condition**: Determines whether the loop will execute or stop. If
       * `true`, the loop runs; if `false`, it exits.
       * 3. **Iteration**: Moves the loop forward, typically by updating variables
       * after each repetition.
       * 4. **Termination**: The loop stops when the condition is no longer met.
       * 
       * ### Common Loop Types:
       * - **`for` loop**: Repeats a set number of times.
       * - **`while` loop**: Runs as long as a condition is true.
       * - **`do-while` loop**: Similar to `while`, but ensures the loop runs at least
       * once.
       * 
       * Loops allow you to handle repetitive tasks efficiently, such as processing
       * arrays, iterating through lists, or automating calculations.
       */

      // Before Starting Loop Let's Discuss Pre-increment and Post-Increment operator

      // The pre-increment (++var) and post-increment (var++) operators in Java are
      // used to increase the value of a variable by one, but they differ in when the
      // increment occurs in relation to the variable's use in expressions.

      // 1. Pre-Increment (++var)
      // The increment happens before the variable is used in an expression.
      // The variable’s value is increased by one, and the updated value is used
      // immediately in the expression.

      int x = 5;
      int y = ++x; // x is incremented first, then assigned to y
      System.out.println(x); // Output: 6
      System.out.println(y); // Output: 6

      // Post-Increment (var++)
      // The variable is used first in the expression, and the increment happens
      // afterward.
      // The original value of the variable is used in the expression, then the
      // variable is increased by one.
      // Example:
      int a = 5;
      int b = a++; // x is assigned to y first, then incremented
      System.out.println(a); // Output: 6
      System.out.println(b); // Output: 5



       /*
         
                                         Summary Table

                Operator	Increment Timing	   Value in Expression	   Updated Variable Value
                ++var	Before using in expression	Incremented value	    Updated immediately
                var++	After using in expression	Original value	         Updated afterward
         */


      // * The For Loop:

      /*
       * A **`for` loop** in Java is a control structure used to repeat a block of
       * code a specific number of times. It's particularly useful when the number of
       * iterations is known in advance.
       * 
       * ### Syntax
       * ```java
       * for (initialization; condition; update) {
       * // code to execute
       * }
       * ```
       * 
       * ### Components:
       * 1. **Initialization**: Sets up a variable for counting or tracking the loop’s
       * progress (e.g., `int i = 0`).
       * 2. **Condition**: A boolean expression that, if true, allows the loop to run;
       * if false, it stops the loop (e.g., `i < 10`).
       * 3. **Update**: Alters the loop variable after each iteration, usually by
       * incrementing or decrementing (e.g., `i++`).
       * 
       */

      System.out.println("The for Loop:");
      for (int i = 0; i < 5; i++) {
         System.out.println(i);
      }

      /*
       * 
       * How It Works
       * The loop starts by initializing i to 0.
       * Checks if i < 5; if true, it executes the code block.
       * After each iteration, i is incremented.
       * The loop stops when i < 5 becomes false.
       * The for loop is compact and ideal when you know how many times to iterate.
       */

      // For Loop Without Update

      System.out.println("For Loop with Updatation");
      for (int j = 0; j < 10; j++) { // With update
         System.out.println(j);
      }
      System.out.println("For Loop without Updatation");
      for (int j = 0; j < 10;) { // Without Updatation
         System.out.println(j); // Infinite Loop occurs
      }

      // For Loop without Conditions
      System.out.println("For Loop with Condition");
      for (int j = 0; j < 10; j++) {
         System.out.println(j);
      }
       

      // System.out.println("For Loop without Condition");
      // for (int j = 0;; j++) {
      //    System.out.println(j); // Infinite Loop occurs
      // }




   /*
       * Nested For Loops in Java
       * 
       * A nested for loop is a loop within another loop. This construct is useful for
       * iterating over multiple dimensions of data structures or performing
       * repetitive tasks that require multiple levels of iteration.
       */

       // Basic Structure:

       /* 
        
         for (initialization1; condition1; increment1) {
            for (initialization2; condition2; increment2) {
               / Code to be executed
            }
         }

         How it Works:

         Outer Loop:
         The outer loop's initialization, condition, and increment parts are executed first.
         Inner Loop:
         For each iteration of the outer loop, the inner loop starts its execution.
         The inner loop's initialization, condition, and increment parts are executed.
         The code inside the inner loop is executed repeatedly until the inner loop's condition becomes false.
         Back to Outer Loop:
         After the inner loop completes its iterations, the outer loop's increment is executed, and the process repeats.
        */
        for (int i = 1; i <= 10; i++) {
         for (int j = 1; j <= 10; j++) {
             System.out.print(i * j + "\t");
         }
         System.out.println();
     }
     
         
   }    
   
}