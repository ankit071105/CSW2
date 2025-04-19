package Assignment2.Part2;

import java.util.PriorityQueue;

public class Q11 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 10, 8, 7, 3, 4, 6, 5, 9};
        
        // Create min-heap using PriorityQueue
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        // Add all elements to the heap
        for (int num : arr) {
            minHeap.add(num);
        }
        
        // Dequeue and print elements in ascending order
        System.out.print("Elements in order: ");
        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " ");
        }
    }
}