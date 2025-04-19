// Interface for loose coupling - EnrollmentSystem doesn't depend on concrete implementations
interface EnrollmentSystem {
    void enroll(Student s, Course c);

    void drop(Student s, Course c);

    void displayEnrollments();
}

// High cohesion - Student class only handles student-related data
class Student {
    private String id;
    private String name;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

// High cohesion - Course class only handles course-related data
class Course {
    private String code;
    private String title;

    public Course(String code, String title) {
        this.code = code;
        this.title = title;
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }
}

// High cohesion - Enrollment handles all enrollment operations
class Enrollment implements EnrollmentSystem {
    private Map<Student, List<Course>> enrollments = new HashMap<>();

    @Override
    public void enroll(Student s, Course c) {
        enrollments.computeIfAbsent(s, k -> new ArrayList<>()).add(c);
    }

    @Override
    public void drop(Student s, Course c) {
        if (enrollments.containsKey(s)) {
            enrollments.get(s).remove(c);
        }
    }

    @Override
    public void displayEnrollments() {
        enrollments.forEach((student, courses) -> {
            System.out.println(student.getName() + ":");
            courses.forEach(c -> System.out.println("  - " + c.getTitle()));
        });
    }
}

public class MainEnrollApp {
    public static void main(String[] args) {
        // Loose coupling - we depend on the EnrollmentSystem interface
        EnrollmentSystem system = new Enrollment();

        Student s1 = new Student("1001", "Alice");
        Student s2 = new Student("1002", "Bob");

        Course c1 = new Course("CS101", "Programming");
        Course c2 = new Course("MATH202", "Calculus");

        system.enroll(s1, c1);
        system.enroll(s1, c2);
        system.enroll(s2, c1);

        system.displayEnrollments();

        system.drop(s1, c2);
        System.out.println("\nAfter dropping:");
        system.displayEnrollments();
    }
}