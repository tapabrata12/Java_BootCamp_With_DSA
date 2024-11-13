package day3.Pattern_Printing;

public class Reverse_Floyed_Tringle_NonIncresing_Numbers {
    public static void main(String[] args) {
        for (int row = 4; row >= 1; row--) {
            int number = 1;
            for (int column = 1; column <= 4; column++) {
                if (column >= row) {
                    System.out.print(number + " ");
                    number++;
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // Alternative Approch 

        // for (int row = 1; row <= 4; row++) {
        //     int number = 1;
        //     for (int column = 1; column <= 4; column++) {
        //         if (row+column>=5) {
        //             System.out.print(number + " ");
        //             number++;
        //         }
        //         else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }
    }
}
