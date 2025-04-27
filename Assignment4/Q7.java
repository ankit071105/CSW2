import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private int id;
    private List<String> courses;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.courses = new ArrayList<>();
    }

    public void enrollCourse(String courseName) {
        courses.add(courseName);
    }

    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("Enrolled Courses: " + courses);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Student object '" + name + "' is garbage collected.");
    }
}

public class UniversityEnrollment {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memory before enrollment:");
        printMemoryUsage(runtime);
        Student student1 = new Student("Alice", 101);
        student1.enrollCourse("Computer Science");
        student1.enrollCourse("Mathematics");
        Student student2 = new Student("Bob", 102);
        student2.enrollCourse("Physics");
        student2.enrollCourse("Chemistry");
        student1.displayInfo();
        student2.displayInfo();

        System.out.println("\nMemory after creating students:");
        printMemoryUsage(runtime);
        student1 = null;
        student2 = null;
        System.gc();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nMemory after garbage collection:");
        printMemoryUsage(runtime);
    }

    private static void printMemoryUsage(Runtime runtime) {
        long totalMemory = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        long usedMemory = totalMemory - freeMemory;
        System.out.println("Total Memory: " + (totalMemory / (1024 * 1024)) + " MB");
        System.out.println("Free Memory: " + (freeMemory / (1024 * 1024)) + " MB");
        System.out.println("Used Memory: " + (usedMemory / (1024 * 1024)) + " MB");
        System.out.println("------------------------------------------");
    }
}
