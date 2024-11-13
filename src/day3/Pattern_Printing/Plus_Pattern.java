package day3.Pattern_Printing;

public class Plus_Pattern {
    public static void main(String[] args) {
        for (int row = 1; row <= 5; row++) {
            for(int column = 1; column <= 5; column++){
                    if(row == 3){
                        System.out.print("* ");
                    }
                    else if (column == 3) {
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
            }
            System.out.println();
        }
    }
}
