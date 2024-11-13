package day3.Pattern_Printing;

public class Pyramid_Pattern {
    public static void main(String[] args) {
        for (int row = 0; row < 4; row++) {
            for (int column = 1; column <= 7; column++) {
                if (4 - row <= column && column <= 4 + row) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        
        // Alternative Approch

        // for (int row = 0; row < 4; row++) {
        //     for (int spaces = 0; spaces < 3-row ; spaces++) {
        //        System.out.print("  ");
        //     }
        //     for(int stars = 0; stars < 2*row + 1; stars++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
    }
}
