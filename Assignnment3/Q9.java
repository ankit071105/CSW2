package Assignnment3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q9 {
    public static int readInt() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter an integer: ");
                return sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                sc.nextLine(); // Clear invalid input
            }
        }
    }

    public static void main(String[] args) {
        int num = readInt();
        System.out.println("You entered: " + num);
    }
}