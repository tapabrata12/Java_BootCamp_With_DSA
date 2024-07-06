package Java_College_Programs.Day10;

import java.util.*;

public class CommandLine {
    public static void main(String[] args) {
        Vector<String> list = new Vector<>();
        int length = args.length;
        for (int i = 0; i < length; i++) {
            list.add(args[i]);
        }
        for (int i = 0; i < length; i++) {
            System.out.println(list.get(i));
        }
    }
}

