package Assignment5;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File file = new File("diary.txt");
        
        if (file.exists()) {
            System.out.println("Warning: diary.txt already exists. New entry will be appended.");
        }
        
        System.out.print("Enter your diary entry: ");
        String entry = sc.nextLine();
        
        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write(LocalDate.now() + ": " + entry + "\n\n");
            System.out.println("Entry successfully saved to diary.txt");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
        
        sc.close();
    }
}
