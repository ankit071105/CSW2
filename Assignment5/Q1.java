package Assignment5;

public class Q1 {
    public static void main(String[] args) {
        // Using string literals
        String s1 = "Hello";
        String s2 = "Hello";
        
        // Using new keyword
        String s3 = new String("Hello");
        String s4 = new String("Hello");
        
        // Memory comparison
        System.out.println("s1 == s2: " + (s1 == s2)); // true (same reference)
        System.out.println("s3 == s4: " + (s3 == s4)); // false (different references)
        
        // Value comparison
        System.out.println("s1.equals(s2): " + s1.equals(s2)); // true
        System.out.println("s3.equals(s4): " + s3.equals(s4)); // true
        System.out.println("s1.equals(s3): " + s1.equals(s3)); // true
    }
}
