package strings;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Initial Text");

        // Append
        sb.append(" appended text");
        System.out.println(sb.toString());  // Output: Initial Text appended text

        // Insert
        sb.insert(8, " inserted");
        System.out.println(sb.toString());  // Output: Initial inserted Text appended text

        // Replace
        sb.replace(8, 17, "REPLACED");
        System.out.println(sb.toString());  // Output: Initial REPLACED Text appended text

        // Delete
        sb.delete(8, 16);
        System.out.println(sb.toString());  // Output: Initial d Text appended text

        // Delete character at
        sb.deleteCharAt(8);
        System.out.println(sb.toString());  // Output: Initial Text appended text

        // Reverse
        sb.reverse();
        System.out.println(sb.toString());  // Output: txet dedneppa txeT laitinI

        // Convert to String
        String finalString = sb.toString();
        System.out.println(finalString);  // Output: txet dedneppa txeT laitinI
    }
}
