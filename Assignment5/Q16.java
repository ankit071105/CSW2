package Assignment5;

import java.io.*;
import java.util.*;

public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String n = sc.nextLine();
        File f = new File(n);
        
        if (f.exists()) {
            System.out.println("File name: " + f.getName());
            System.out.println("Path: " + f.getAbsolutePath());
            System.out.println("Size: " + f.length() + " bytes");
            System.out.println("Last modified: " + new Date(f.lastModified()));
            System.out.println("Readable: " + f.canRead());
            System.out.println("Writable: " + f.canWrite());
            System.out.println("Executable: " + f.canExecute());
        } else {
            System.out.println("File does not exist.");
        }
        sc.close();
    }
}
