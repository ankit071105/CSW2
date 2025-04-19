import java.util.*;

class Student {
    String name;
    int rollNo;
    int age;

    Student(String n, int r, int a) {
        name = n;
        rollNo = r;
        age = a;
    }

    @Override
    public String toString() {
        return name + " (Roll: " + rollNo + ", Age: " + age + ")";
    }
}

public class Q7 {
    public static void main(String[] args) {
        Student[] students = {
            new Student("Rahul", 103, 20),
            new Student("Priya", 101, 19),
            new Student("Amit", 102, 21)
        };

        // Sort by rollNo
        Arrays.sort(students, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.rollNo, s2.rollNo);
            }
        });
        System.out.println("Sorted by Roll No:");
        for (Student s : students) System.out.println(s);

        // Sort by age
        Arrays.sort(students, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.age, s2.age);
            }
        });
        System.out.println("\nSorted by Age:");
        for (Student s : students) System.out.println(s);
    }
}