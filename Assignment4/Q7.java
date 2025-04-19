package Assignment4;

import java.util.*;

class Q7 {
    private String id;
    private String name;
    private List<String> courses = new ArrayList<>();

    public Q7(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void enroll(String course) {
        courses.add(course);
    }

    public void drop(String course) {
        courses.remove(course);
    }

    @Override
    protected void finalize() {
        System.out.println("GC collected student: " + id);
    }

    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        printMemory("Start");

        // Create and enroll students
        Q7 s1 = new Q7("S001", "Alice");
        s1.enroll("CS101");
        s1.enroll("MATH202");
        
        Q7 s2 = new Q7("S002", "Bob");
        s2.enroll("PHYS101");

        printMemory("After enrollment");

        // Simulate student leaving
        s1 = null;
        System.gc();
        try { Thread.sleep(500); } catch (Exception e) {} // Allow GC to run
        printMemory("After GC");
    }

    static void printMemory(String phase) {
        System.out.printf("%-20s Total: %6d MB, Free: %6d MB%n",
                phase,
                Runtime.getRuntime().totalMemory() / (1024 * 1024),
                Runtime.getRuntime().freeMemory() / (1024 * 1024));
    }
}