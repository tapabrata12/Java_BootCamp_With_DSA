import java.util.Scanner;

class VowelASCIISum {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = inputScanner.nextLine();

        int sum = 0;
        for (char c : userInput.toLowerCase().toCharArray()) {
            if (isVowel(c)) {
                sum += (int) c;
            }
        }

        System.out.println("Sum of ASCII values of vowels: " + sum);
    }

    private static boolean isVowel(char c) {
        return "aeiou".contains(String.valueOf(c));
    }
}
