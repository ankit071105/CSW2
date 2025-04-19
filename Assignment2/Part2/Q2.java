package Assignment2.Part2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Q2 {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("John", 25));
        users.add(new User("Alice", 20));
        users.add(new User("Bob", 30));

        System.out.println("Original list:");
        for (User u : users) {
            System.out.println(u.getName() + " - " + u.getAge());
        }

        Collections.sort(users, Comparator.comparingInt(User::getAge));

        System.out.println("\nSorted by age:");
        for (User u : users) {
            System.out.println(u.getName() + " - " + u.getAge());
        }
    }
}
