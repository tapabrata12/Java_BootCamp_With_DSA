package _3_Literals;

class EscapeSequences {
    public static void main(String[] args) {
        // Escape Sequence characters
        /*
        Represent special characters within charecter and String literals, they are written backslash '\'

        Example:
        \' --> for single quote
        \" --> for double quote
        \\ --> for backslash
        \n --> newline
        \t --> for tab
        \r --> for carriage return
        \b --> for backspace
         */
        char singleQuote = '\'';
        System.out.println(singleQuote);
        String quoteExample = "She said, \"Hello\" ";
        System.out.println(quoteExample);
        String newLine = "I am a \nBoy";
        System.out.println(newLine);

    }
}
