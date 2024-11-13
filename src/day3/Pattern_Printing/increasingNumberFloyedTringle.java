package day3.Pattern_Printing;

public class increasingNumberFloyedTringle {
    public static void main(String[] args) {

        int number = 1;
        for(int row = 1; row <=4; row++){
            for (int column = 1; column <= row; column++) {
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
}
