package Assignment2.Part2;

import java.util.HashMap;
import java.util.Map;

class Book {
    private int id;
    private String name;
    private String author;
    private int quantity;

    public Book(int id, String name, String author, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.quantity = quantity;
    }

    public String getName() { return name; }
    
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Author: " + author + ", Quantity: " + quantity;
    }
}

public class Q5 {
    public static void main(String[] args) {
        HashMap<Integer, Book> books = new HashMap<>();
        books.put(101, new Book(101, "Java Programming", "John Doe", 5));
        books.put(102, new Book(102, "Python Basics", "Jane Smith", 3));

        System.out.println("Books in Library:");
        for (Map.Entry<Integer, Book> entry : books.entrySet()) {
            System.out.println(entry.getValue());
        }

        // (a) Check if book name exists
        String searchName = "Java Programming";
        boolean found = books.values().stream()
                           .anyMatch(book -> book.getName().equals(searchName));
        System.out.println("\nBook '" + searchName + "' exists: " + found);

        // (b) Remove book by ID
        int removeId = 101;
        Book removed = books.remove(removeId);
        System.out.println("\nRemoved book with ID " + removeId + ": " + (removed != null));

        System.out.println("\nUpdated Books:");
        books.forEach((id, book) -> System.out.println(book));
    }
}