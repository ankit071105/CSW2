package Assignment5;

import java.io.File;
import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file path to delete: ");
        String filePath = sc.nextLine();
        sc.close();

        File file = new File(filePath);

        if (!file.exists()) {
            System.out.println("Error: File does not exist");
            return;
        }

        if (file.delete()) {
            System.out.println("File deleted successfully");
        } else {
            System.out.println("Failed to delete the file");
        }
    }
}