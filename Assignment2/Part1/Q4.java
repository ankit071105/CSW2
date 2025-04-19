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
}

public class Q4 {
    public static void main(String[] args) {
        Student[] students = {
            new Student("Rahul", 101, 85.5),
            new Student("Priya", 102, 90.0),
            new Student("Amit", 103, 78.5)
        };

        int searchRoll = 102; // Student to find
        Student found = null;

        for (Student s : students) {
            if (s.compareTo(new Student("", searchRoll, 0)) == 0) {
                found = s;
                break;
            }
        }

        System.out.println(found != null ? "Found: " + found.name : "Student not found");
    }
}