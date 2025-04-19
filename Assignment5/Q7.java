package Assignment5;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        
        System.out.print("Enter word to replace: ");
        String oldWord = sc.next();
        
        System.out.print("Enter new word: ");
        String newWord = sc.next();
        
        int index = sentence.indexOf(oldWord);
        String modified;
        
        if(index != -1) {
            modified = sentence.substring(0, index) + newWord + 
                      sentence.substring(index + oldWord.length());
        } else {
            modified = sentence; // No change if word not found
        }
        
        System.out.println("\nOriginal sentence: " + sentence);
        System.out.println("Modified sentence: " + modified);
        
        sc.close();
    }
}
