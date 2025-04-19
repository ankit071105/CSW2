package Assignment5;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your new diary entry: ");
        String entry = sc.nextLine();
        sc.close();

        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
        
        try (FileWriter writer = new FileWriter("diary.txt", true)) {
            writer.write("\n[" + timestamp + "]\n" + entry + "\n");
            System.out.println("Entry successfully appended to diary.txt");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
