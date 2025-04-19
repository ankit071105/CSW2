package Assignment5;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial string: ");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        
        while (true) {
            System.out.println("\nCurrent string: " + sb);
            System.out.println("1. Add substring at position");
            System.out.println("2. Remove characters");
            System.out.println("3. Modify character");
            System.out.println("4. Concatenate string");
            System.out.println("5. Exit");
            System.out.print("Choose operation: ");
            
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    System.out.print("Enter position: ");
                    int pos = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter substring: ");
                    sb.insert(pos, sc.nextLine());
                    break;
                    
                case 2:
                    System.out.print("Enter start index: ");
                    int start = sc.nextInt();
                    System.out.print("Enter end index: ");
                    sb.delete(start, sc.nextInt());
                    break;
                    
                case 3:
                    System.out.print("Enter index: ");
                    int idx = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new character: ");
                    sb.setCharAt(idx, sc.nextLine().charAt(0));
                    break;
                    
                case 4:
                    System.out.print("Enter string to append: ");
                    sb.append(sc.nextLine());
                    break;
                    
                case 5:
                    sc.close();
                    return;
                    
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
