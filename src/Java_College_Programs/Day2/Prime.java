package Java_College_Programs.Day2;
import java.util.Scanner;

class PrimeCheck {
    int num;
    boolean flag = false;

    public void data() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to check: ");
        num = scanner.nextInt();
    }

    public void calculate() {
        for (int i = 2; i <= num / 2; i++) {
            // Condition for non-prime number
            if (num % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}

 class ori {
    public static void main(String[] args) {
        PrimeCheck primeChecker = new PrimeCheck();
        primeChecker.data();
        primeChecker.calculate();
    }
}
