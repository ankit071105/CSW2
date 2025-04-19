class College {
    String name;
    String location;

    College(String n, String loc) {
        this.name = n;
        this.location = loc;
    }
}

class Student {
    int id;
    String name;
    College college;

    Student(int id, String name, College c) {
        this.id = id;
        this.name = name;
        this.college = c;
    }

    void displayInfo() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("College: " + college.name);
        System.out.println("Location: " + college.location + "\n");
    }
}

public class MainApp {
    public static void main(String[] args) {
        College c1 = new College("MIT", "Cambridge");
        College c2 = new College("Stanford", "California");

        Student s1 = new Student(101, "Alice", c1);
        Student s2 = new Student(102, "Bob", c2);

        s1.displayInfo();
        s2.displayInfo();
    }
}