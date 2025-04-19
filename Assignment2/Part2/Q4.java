package Assignment2.Part2;

import java.util.LinkedList;
import java.util.Scanner;

class Student {
    private String name;
    private int age;
    private double mark;

    public Student(String name, int age, double mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    // Getters and setters
    public String getName() { return name; }
    public int getAge() { return age; }
    public double getMark() { return mark; }
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setMark(double mark) { this.mark = mark; }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return age == student.age &&
               Double.compare(student.mark, mark) == 0 &&
               name.equals(student.name);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Mark: " + mark;
    }
}

public class Q4 {
    public static void main(String[] args) {
        LinkedList<Student> list = new LinkedList<>();
        list.add(new Student("Alice", 20, 85.5));
        list.add(new Student("Bob", 21, 75.0));
        list.add(new Student("Charlie", 19, 90.0));

        // (a) Display students
        System.out.println("Students:");
        for (Student s : list) {
            System.out.println(s);
        }

        // (b) Check existence
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter student details to search:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Age: ");
        int age = sc.nextInt();
        System.out.print("Mark: ");
        double mark = sc.nextDouble();

        Student searchStudent = new Student(name, age, mark);
        boolean exists = list.contains(searchStudent);
        System.out.println("\nStudent exists: " + exists);
        System.out.println("(Note: contains() uses equals() for content comparison)");

        // (c) Remove student
        System.out.println("\nEnter student details to remove:");
        sc.nextLine(); // consume newline
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Age: ");
        age = sc.nextInt();
        System.out.print("Mark: ");
        mark = sc.nextDouble();

        boolean removed = list.remove(new Student(name, age, mark));
        System.out.println("Student removed: " + removed);

        // (d) Count students
        System.out.println("\nNumber of students: " + list.size());

        // Display final list
        System.out.println("\nRemaining students:");
        for (Student s : list) {
            System.out.println(s);
        }
    }
}
