package Assignment2.Part2;

import java.util.HashMap;

public class Q10 {
    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 7, 1, 10, 8, 5}; // Example array (missing 6 and 9)
        
        HashMap<Integer, Boolean> map = new HashMap<>();
        
        // Mark all present numbers
        for (int num : arr) {
            if (num >= 1 && num <= 10) {
                map.put(num, true);
            }
        }
        
        // Find the smallest missing
        int missing = 1;
        while (missing <= 10 && map.containsKey(missing)) {
            missing++;
        }
        
        System.out.println("Smallest missing positive number: " + missing);
    }
}