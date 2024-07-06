package Java_College_Programs.Day7;
class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        // Append a string
        sb.append(" World!");
        System.out.println("Append: " + sb);

        // Insert a string at a specific index
        sb.insert(0, "Hi ");
        System.out.println("Insert: " + sb);

        // Reverse the string
        sb.reverse();
        System.out.println("Reverse: " + sb);

        // Delete a substring
        sb.delete(0, 3);
        System.out.println("Delete: " + sb);

        // Replace a substring
        sb.replace(4, 5, "Universe");
        System.out.println("Replace: " + sb);
    }
}
