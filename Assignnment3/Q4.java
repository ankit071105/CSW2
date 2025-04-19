package Assignnment3;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        
        try {
            if (num < 0) {
                throw new ArithmeticException("Cannot find square root of negative number");
            }
            double sqrt = Math.sqrt(num);
            System.out.printf("Square root of %d is %.2f%n", num, sqrt);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}