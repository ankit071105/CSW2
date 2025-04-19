package Assignment5;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        while(true) {
            System.out.println("\nCurrent string: " + str);
            System.out.println("1. Convert to lowercase");
            System.out.println("2. Convert to uppercase");
            System.out.println("3. Search for character");
            System.out.println("4. Find character at index");
            System.out.println("5. Concatenate another string");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");
            
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline
            
            switch(choice) {
                case 1:
                    str = str.toLowerCase();
                    System.out.println("Lowercase: " + str);
                    break;
                    
                case 2:
                    str = str.toUpperCase();
                    System.out.println("Uppercase: " + str);
                    break;
                    
                case 3:
                    System.out.print("Enter character to search: ");
                    char ch = sc.nextLine().charAt(0);
                    int index = str.indexOf(ch);
                    if(index != -1) {
                        System.out.println("Found at index: " + index);
                    } else {
                        System.out.println("Character not found");
                    }
                    break;
                    
                case 4:
                    System.out.print("Enter index: ");
                    int idx = sc.nextInt();
                    sc.nextLine();
                    if(idx >= 0 && idx < str.length()) {
                        System.out.println("Character at index " + idx + ": " + str.charAt(idx));
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                    
                case 5:
                    System.out.print("Enter string to concatenate: ");
                    str += sc.nextLine();
                    System.out.println("Concatenated string: " + str);
                    break;
                    
                case 6:
                    sc.close();
                    return;
                    
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
