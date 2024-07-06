package Java_College_Programs.Day6;

import java.util.Scanner;

public class AbbreviateString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        
        int desiredWidth = 10; 

        if (inputString.length() > desiredWidth) {
           
            String abbreviatedString = inputString.substring(0, desiredWidth - 3) + "...";
            System.out.println("Abbreviated string: " + abbreviatedString);
        } else {
            System.out.println("The string doesn't need abbreviation.");
        }
    }
}
