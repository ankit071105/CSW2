package Assignnment3;

import java.io.*;

public class Q11 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            String line;
            int count = 0;

            while ((line = br.readLine()) != null) {
                count++;
                System.out.println("Line " + count + ": " + line);
            }

            br.close();
            System.out.println("Total lines: " + count);

        } catch (IOException e) {
            System.err.println("Error processing file: " + e.getMessage());
        }
    }
}