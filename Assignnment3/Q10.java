package Assignnment3;

import java.io.*;

// Custom exceptions
class FileNotFoundException extends Exception {
    public FileNotFoundException(String msg) { super(msg); }
}

class FileReadPermissionException extends Exception {
    public FileReadPermissionException(String msg) { super(msg); }
}

public class Q10 {
    public static void main(String[] args) {
        try {
            if (args.length == 0 || args[0] == null) {
                throw new FileNotFoundException("No file path provided");
            }
            
            File file = new File(args[0]);
            if (!file.exists()) {
                throw new FileNotFoundException("File not found: " + args[0]);
            }
            if (!file.canRead()) {
                throw new FileReadPermissionException("No read permission for: " + args[0]);
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
            
        } catch (FileNotFoundException | FileReadPermissionException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("IO Error: " + e.getMessage());
        }
    }
}