import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer text = new StringBuffer();
        
        while (true) {
            System.out.println("\nCurrent Text: " + text);
            System.out.println("Length: " + text.length() + ", Capacity: " + text.capacity());
            System.out.println("\nMenu:");
            System.out.println("1. Append text");
            System.out.println("2. Insert text");
            System.out.println("3. Delete text");
            System.out.println("4. Reverse text");
            System.out.println("5. Replace text");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");
            
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline
            
            switch (choice) {
                case 1:
                    System.out.print("Enter text to append: ");
                    text.append(sc.nextLine());
                    break;
                    
                case 2:
                    System.out.print("Enter index to insert at: ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter text to insert: ");
                    text.insert(index, sc.nextLine());
                    break;
                    
                case 3:
                    System.out.print("Enter start index: ");
                    int start = sc.nextInt();
                    System.out.print("Enter end index: ");
                    text.delete(start, sc.nextInt());
                    break;
                    
                case 4:
                    text.reverse();
                    break;
                    
                case 5:
                    System.out.print("Enter start index: ");
                    start = sc.nextInt();
                    System.out.print("Enter end index: ");
                    int end = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter replacement text: ");
                    text.replace(start, end, sc.nextLine());
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