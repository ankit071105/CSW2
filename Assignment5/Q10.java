package Assignment5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        try {
            File file = new File("diary.txt");
            Scanner fileScanner = new Scanner(file);
            
            System.out.println("=== Diary Entries ===");
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
            
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: diary.txt not found. No entries exist yet.");
        }
    }
}
