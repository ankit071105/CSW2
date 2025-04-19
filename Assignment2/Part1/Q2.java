package Assignment2;

class Book {
    int bookId;
    String bookName;
    double price;

    Book(int bookId, String bookName, double price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "ID: " + bookId + ", Name: " + bookName + ", Price: " + price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book other = (Book) obj;
        return Double.compare(other.price, price) == 0;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Book b1 = new Book(101, "Java", 450.50);
        Book b2 = new Book(102, "Python", 450.50);

        System.out.println("Book 1: " + b1);
        System.out.println("Book 2: " + b2);

        if (b1.equals(b2)) {
            System.out.println("Books have same price");
        } else {
            System.out.println("Books have different prices");
        }
    }
}