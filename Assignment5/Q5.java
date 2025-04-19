package Assignment5;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();
        
        // Convert to lowercase
        String lower1 = s1.toLowerCase();
        String lower2 = s2.toLowerCase();
        
        // Convert to uppercase
        String upper1 = s1.toUpperCase();
        String upper2 = s2.toUpperCase();
        
        // Compare case-insensitive
        boolean equalIgnoreCase = s1.equalsIgnoreCase(s2);
        
        // Display results
        System.out.println("\nLowercase conversions:");
        System.out.println("First string: " + lower1);
        System.out.println("Second string: " + lower2);
        
        System.out.println("\nUppercase conversions:");
        System.out.println("First string: " + upper1);
        System.out.println("Second string: " + upper2);
        
        System.out.println("\nCase-insensitive comparison result: " + equalIgnoreCase);
        
        sc.close();
    }
}
