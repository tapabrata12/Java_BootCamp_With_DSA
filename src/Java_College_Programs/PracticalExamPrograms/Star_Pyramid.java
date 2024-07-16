package Java_College_Programs.PracticalExamPrograms;

import java.util.Scanner;

public class Star_Pyramid {
    public static void main(String[] args) {

            System.out.print("Enter the no. lines: ");
            Scanner sc = new Scanner(System.in);
            int rows = sc.nextInt();

            for (int i = 0; i < rows; i++) {
                // Print spaces
                for (int j = 0; j < rows - i - 1; j++) {
                    System.out.print(" ");
                }

                // Print stars
                for (int k = 0; k <= i; k++) {
                    System.out.print("* ");
                }

                // Move to the next line
                System.out.println();
            }

    }
}
