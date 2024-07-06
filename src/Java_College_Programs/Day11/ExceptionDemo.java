package Java_College_Programs.Day11;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            // Arithmetic Exception
            int result = 10 / 0;
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        }

        try {
            // Array Out of Bounds Exception
            int[] numbers = {1, 2, 3};
            System.out.println("Element at index 3: " + numbers[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Out of Bounds Exception: " + e.getMessage());
        } finally {
            assert System.out != null;
            System.out.println("Finally block executed.");
        }
    }
}
