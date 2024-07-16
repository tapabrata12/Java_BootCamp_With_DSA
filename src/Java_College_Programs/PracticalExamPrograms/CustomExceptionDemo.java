package Java_College_Programs.PracticalExamPrograms;

class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {
    // Method to demonstrate throwing the custom exception
    static void validate(int age) throws MyCustomException {
        if (age < 18) {
            throw new MyCustomException("Age is less than 18. Access denied.");
        } else {
            System.out.println("Access granted.");
        }
    }

    public static void main(String[] args) {
        try {
            // Test case 1: Age is less than 18
            validate(15);
        } catch (MyCustomException e) {
            System.out.println("Caught the exception: " + e.getMessage());
        }

        try {
            // Test case 2: Age is 18 or more
            validate(20);
        } catch (MyCustomException e) {
            System.out.println("Caught the exception: " + e.getMessage());
        }
    }
}

