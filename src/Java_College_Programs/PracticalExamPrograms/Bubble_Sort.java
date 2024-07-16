package Java_College_Programs.PracticalExamPrograms;
import java.util.Scanner;
public class Bubble_Sort {
    public static void main(String[] args) {
        int number;
        System.out.print("Enter number of elements: ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        int[] Bubble = new int[number];

        System.out.println("Array Input: ");
        for (int i = 0; i < number; i++) {
            System.out.print("Array Element "+i+": ");
            Bubble[i] = sc.nextInt();
        }

        System.out.println("Array Output (Before Sort): ");
        for (int i = 0; i < number; i++) {
            System.out.print(Bubble[i]+" ");
        }
        B_Sort(Bubble);
    }

    static void B_Sort(int[] bubble) {
        boolean flag;

        for (int i = 0; i < bubble.length - 1; i++) {
            flag = false;
            for (int j = 0; j < bubble.length - 1 - i; j++) {
                if (bubble[j] > bubble[j + 1]) { // Corrected the comparison to sort in ascending order
                    Swap(bubble, j, j + 1);
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
        System.out.println();
        System.out.println("Array Output (After Sort): ");
        for (int i = 0; i < bubble.length; i++) {
            System.out.print(bubble[i] + " ");
        }
    }

    static void Swap(int[] array, int m, int n) {
        int temp = array[m];
        array[m] = array[n];
        array[n] = temp;
    }
}
