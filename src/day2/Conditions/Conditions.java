package day2.Conditions;

public class Conditions {
    public static void main(String[] args) {
        /*
         * Conditional Statements in Java:
         * 
         * Conditional statements in Java allow you to execute different code blocks
         * based on specific conditions.
         * 
         * Here are the two primary types:
         * 
         * 1. if Statement
         * 
         * Basic Structure:
         * 
         * if (condition) {
         * 
         * / Code to be executed if the condition is true
         * }
         */

        // In conditions everything takes as binary true and false

        int age = 25;
        if (age >= 18) {
            System.out.println("You are an adult.");
        }

        /*
         * 
         * 2. if-else Statement  
         * 
         * Structure:
         * 
         * if (condition) {
         * / Code to be executed if the condition is true
         * } else {
         * / Code to be executed if the condition is false
         * }
         * 
         */

        int number = 10;
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

        /*
         * 
         * Nested if-else Statements
         * 
         * While nested if-else statements can be used to create more complex
         * decision-making structures, it's often recommended to avoid excessive nesting
         * for better readability. Instead, consider using logical operators (&&, ||, !)
         * to combine conditions or breaking down complex logic into smaller, more
         * manageable if-else blocks.
         * 
         * Example:
         * 
         */

        int score = 85;
        if (score >= 90) {
            System.out.println("Excellent!");
        } else {
            if (score >= 80) {
                System.out.println("Very Good!");
            } else {
                if (score >= 70) {
                    System.out.println("Good");
                } else {
                    System.out.println("Needs Improvement");
                }
            }
        }

        /*
         * The else if Statement in Java
         * 
         * In Java, the else if statement is a conditional statement used to execute
         * different code blocks based on multiple conditions. It's often used in
         * conjunction with an if statement to create a more complex decision-making
         * process.
         * 
         * if (condition1) {
         * // Code to execute if condition1 is true
         * } else if (condition2) {
         * // Code to execute if condition1 is false and condition2 is true
         * } else if (condition3) {
         * // Code to execute if condition1 and condition2 are false and condition3 is
         * true
         * } else {
         * // Code to execute if none of the above conditions are true
         * }
         */

        int numbver2 = 5;

        if (numbver2 > 0) {
            System.out.println("The number is positive.");
        } else if (numbver2 < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

    }

}
