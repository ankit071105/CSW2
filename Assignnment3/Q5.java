package Assignnment3;

public class Q5 {
    public static void main(String[] args) {
        try {
            String numStr = "12a"; // Invalid number format
            try {
                int num = Integer.parseInt(numStr);
                System.out.println("100 divided by " + num + " is: " + (100 / num));
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic Error: " + e.getMessage());
            }
        } catch (NumberFormatException e) {
            System.out.println("Number Format Error: " + e.getMessage());
        }
    }
}