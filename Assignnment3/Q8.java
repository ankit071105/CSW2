package Assignnment3;
// Custom checked exception
class CustomCheckedException extends Exception {
    public CustomCheckedException(String message) {
        super(message);
    }
}

public class Q8 {
    static void validate(int age) throws CustomCheckedException {
        if (age < 18) {
            throw new CustomCheckedException("Age must be 18+");
        }
        System.out.println("Valid age: " + age);
    }

    public static void main(String[] args) {
        try {
            validate(15); // This will throw exception
        } catch (CustomCheckedException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}