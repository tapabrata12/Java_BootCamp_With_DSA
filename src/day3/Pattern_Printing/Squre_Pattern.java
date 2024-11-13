package day3.Pattern_Printing;

public class Squre_Pattern {
    public static void main(String[] args) {
        for (int row = 1; row <= 5; row++) {
            for (int column = 1; column <= 5; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
