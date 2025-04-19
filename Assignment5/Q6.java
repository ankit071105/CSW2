package Assignment5;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        char[] chars = str.toCharArray();
        
        System.out.print("Enter character to search: ");
        char target = sc.next().charAt(0);
        
        int first = -1, last = -1;
        for(int i = 0; i < chars.length; i++) {
            if(chars[i] == target) {
                if(first == -1) first = i;
                last = i;
            }
        }
        
        System.out.println("\nCharacter array:");
        System.out.println(chars);
        
        if(first != -1) {
            System.out.println("First occurrence at index: " + first);
            System.out.println("Last occurrence at index: " + last);
        } else {
            System.out.println("Character not found");
        }
        
        sc.close();
    }
}