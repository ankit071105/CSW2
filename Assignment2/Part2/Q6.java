package Assignment2.Part2;

import java.util.TreeSet;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(15);

        // (a) Display elements
        System.out.println("TreeSet elements: " + numbers);

        // (b) Check if number exists
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter number to search: ");
        int searchNum = sc.nextInt();
        System.out.println("Number " + searchNum + " exists: " + numbers.contains(searchNum));

        // (c) Remove element
        System.out.print("\nEnter number to remove: ");
        int removeNum = sc.nextInt();
        boolean removed = numbers.remove(removeNum);
        System.out.println("Number " + removeNum + " removed: " + removed);
        System.out.println("Updated TreeSet: " + numbers);
    }
}