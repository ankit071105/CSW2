package Assignnment3;

import java.util.Arrays;

public class Q6 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9};
        
        // Sorting
        try {
            Arrays.sort(arr);
            System.out.println("Sorted array: " + Arrays.toString(arr));
        } catch (Exception e) {
            System.out.println("Sorting error: " + e.getMessage());
        }

        // Searching
        try {
            int index = Arrays.binarySearch(arr, 8);
            System.out.println("Element 8 found at index: " + index);
        } catch (Exception e) {
            System.out.println("Search error: " + e.getMessage());
        }

        // Accessing elements
        try {
            System.out.println("Element at index 10: " + arr[10]); // Will throw exception
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index access: " + e.getMessage());
        }

        // Continue execution
        System.out.println("Program continues after exceptions");
    }
}
