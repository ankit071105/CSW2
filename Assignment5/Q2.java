package Assignment5;

public class Q2 {
    public static void main(String[] args) {
        // Demonstrating String immutability
        String s1 = "Hello";
        String s2 = s1.concat(" World");
        
        System.out.println("Original string: " + s1);
        System.out.println("After concat: " + s2);
        System.out.println("s1 unchanged: " + s1);
        
        // Demonstrating CharSequence operations
        CharSequence cs = "Java";
        System.out.println("\nCharSequence length: " + cs.length());
        System.out.println("Char at index 2: " + cs.charAt(2));
        System.out.println("Subsequence (1-3): " + cs.subSequence(1, 3));
    }
}
