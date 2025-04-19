package Assignment5;

import java.io.File;
import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter directory path: ");
        String path = sc.nextLine();
        sc.close();

        File dir = new File(path);
        
        if (!dir.exists()) {
            System.out.println("Error: Directory does not exist");
            return;
        }
        
        if (!dir.isDirectory()) {
            System.out.println("Error: Path is not a directory");
            return;
        }

        System.out.println("\nContents of " + path + ":");
        for (File file : dir.listFiles()) {
            System.out.println(file.getName() + (file.isDirectory() ? " [DIR]" : ""));
        }
    }
}