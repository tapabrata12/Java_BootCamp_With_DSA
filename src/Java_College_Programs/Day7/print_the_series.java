//  print the series  1,-3,5,-7,9....

import java.io.*;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int number, temp, flag = 0;
        Scanner a1 = new Scanner(System.in);
        System.out.print("Enter the term to continue the series?: ");
        number = a1.nextInt();

        System.out.println("According to your " + number + "th term the following series will be:");
        for (int i = 1; i <= number * 2; i += 2) {

            temp = i;
            if (flag == 0) {

                System.out.print(temp + ", ");
                flag = 1;
            } else {
                System.out.print(-temp + ", ");
                flag = 0;
            }

        }
    }
}