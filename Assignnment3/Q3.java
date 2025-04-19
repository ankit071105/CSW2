package Assignnment3;

import java.util.Scanner;

public class Q3 {
    public static int convertToInt(String input) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.print("Invalid number. Enter a valid integer: ");
                input = sc.nextLine();
            }
        }
    }

    public static void main(String[] args) {
        String s = "123abc"; // Test with invalid input
        int num = convertToInt(s);
        System.out.println("Converted number: " + num);
    }
}