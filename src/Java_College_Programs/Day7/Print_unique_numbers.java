import java.util.HashSet;
import java.util.Set;

class UniqueCharactersPrinter {
    public static void main(String[] args) {
        String input = "hello"; // Replace with your desired string
        printUniqueCharacters(input);
    }

    public static void printUniqueCharacters(String test) {
        Set<Character> uniqueChars = new HashSet<>();
        for (char c : test.toCharArray()) {
            if (!uniqueChars.contains(c)) {
                uniqueChars.add(c);
                System.out.print(c);
            }
        }
    }
}
