package Java_College_Programs.PracticalExamPrograms;
/*
ArithmeticException caught: Division by zero is not allowed.
This is the finally block for the ArithmeticException example.
ArrayIndexOutOfBoundsException caught: Array index is out of bounds.
This is the finally block for the ArrayIndexOutOfBoundsException example.
*/
public class ExceptionHandlingDemo {

    public static void main(String[] args) {
        // Demonstrating ArithmeticException
        try {
            int a = 10;
            int b = 0;
            int result = a / b; // This will cause an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: Division by zero is not allowed.");
        } catch (Exception e) {
            System.out.println("General exception caught: " + e.getMessage());
        } finally {
            System.out.println("This is the finally block for the ArithmeticException example.");
        }

        // Demonstrating ArrayIndexOutOfBoundsException
        try {
            int[] array = {1, 2, 3};
            int value = array[5]; // This will cause an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: Array index is out of bounds.");
        } catch (Exception e) {
            System.out.println("General exception caught: " + e.getMessage());
        } finally {
            System.out.println("This is the finally block for the ArrayIndexOutOfBoundsException example.");
        }
    }
}

