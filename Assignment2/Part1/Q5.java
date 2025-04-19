class Student implements Comparable<Student> {
    String name;
    int rollNumber;
    double totalMark;

    Student(String n, int r, double m) {
        name = n;
        rollNumber = r;
        totalMark = m;
    }

    @Override
    public int compareTo(Student s) {
        return Integer.compare(this.rollNumber, s.rollNumber);
    }

    @Override
    public String toString() {
        return rollNumber + ": " + name + " (" + totalMark + ")";
    }
}

public class Q5 {
    public static void main(String[] args) {
        Student[] students = {
            new Student("Rahul", 103, 85.5),
            new Student("Priya", 101, 90.0),
            new Student("Amit", 102, 78.5)
        };

        // Bubble Sort
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - i - 1; j++) {
                if (students[j].compareTo(students[j + 1]) > 0) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }

        // Print sorted students
        for (Student s : students) {
            System.out.println(s);
        }
    }
}