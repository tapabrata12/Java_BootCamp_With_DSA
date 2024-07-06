package Java_College_Programs.Day10;

import java.util.*;

public class VectorMethod{
    public static void main(String[] args) {
        Vector<String> list = new Vector<>();
        int length = args.length;

        System.out.println("Before Insertion:");
        for (int i = 0; i < length; i++) {
            list.add(args[i]);
            System.out.print(list.get(i) + " ");
        }

        list.insertElementAt("Hello", 3);
        length++;

        System.out.println("\nAfter Insertion:");
        for (int i = 0; i < length; i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
