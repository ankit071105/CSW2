package Assignment2;

class Student {
    String name;
    Object rollNumber;
    int age;

    Student(String name, Object rollNumber, int age) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Roll: " + rollNumber + ", Age: " + age);
    }
}

public class Q1 {
    public static void main(String[] args) {
        Student s1 = new Student("Rahul", 101, 20);
        Student s2 = new Student("Priya", "102A", 19);

        s1.display();
        s2.display();
    }
}