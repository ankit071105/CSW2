package Assignment5;

import java.io.File;
import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter current file name: ");
        String oldName = sc.nextLine();
        
        System.out.print("Enter new file name: ");
        String newName = sc.nextLine();
        
        File oldFile = new File(oldName);
        File newFile = new File(newName);
        
        if (!oldFile.exists()) {
            System.out.println("Error: File does not exist");
            return;
        }
        
        if (oldFile.renameTo(newFile)) {
            System.out.println("File renamed successfully");
        } else {
            System.out.println("Error: Unable to rename file");
        }
        
        sc.close();
    }
}
