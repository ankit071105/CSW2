package Assignnment3;

class CustomNullPointerException extends RuntimeException {
    public CustomNullPointerException(String message) {
        super(message);
    }
}

public class Q2 {
    public static void checkString(String s) {
        if (s == null) {
            throw new CustomNullPointerException("Input string cannot be null");
        }
        System.out.println("String is valid: " + s);
    }

    public static void main(String[] args) {
        try {
            checkString(null);
        } catch (CustomNullPointerException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}