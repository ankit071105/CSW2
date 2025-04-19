package Assignment5;

import java.io.*;
import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter source file path: ");
        String srcPath = sc.nextLine();
        
        System.out.print("Enter destination file path: ");
        String destPath = sc.nextLine();
        
        File srcFile = new File(srcPath);
        File destFile = new File(destPath);
        
        if (!srcFile.exists()) {
            System.out.println("Error: Source file does not exist");
            return;
        }
        
        if (destFile.exists()) {
            System.out.print("Destination file exists. Overwrite? (y/n): ");
            if (!sc.nextLine().equalsIgnoreCase("y")) {
                System.out.println("Copy operation cancelled");
                return;
            }
        }
        
        try (InputStream in = new FileInputStream(srcFile);
             OutputStream out = new FileOutputStream(destFile)) {
            
            byte[] buffer = new byte[1024];
            int length;
            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }
            
            System.out.println("File copied successfully");
        }
        
        sc.close();
    }
}