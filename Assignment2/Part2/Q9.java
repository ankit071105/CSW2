package Assignment2.Part2;

import java.util.HashSet;

public class Q9 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 2, 5, 3, 6};
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> repeats = new HashSet<>();

        for (int num : nums) {
            if (!seen.add(num)) {
                repeats.add(num);
            }
        }

        System.out.println("Repeating numbers: " + repeats);
    }
}