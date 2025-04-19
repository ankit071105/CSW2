abstract class LibraryResource {
    private String title;
    private String author;

    public LibraryResource(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public abstract void displayDetails();
}

class Book extends LibraryResource {
    private int pageCount;

    public Book(String title, String author, int pages) {
        super(title, author);
        this.pageCount = pages;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pages) {
        this.pageCount = pages;
    }

    @Override
    public void displayDetails() {
        System.out.println("Book: " + getTitle() + " by " + getAuthor() + ", Pages: " + pageCount);
    }
}

class Magazine extends LibraryResource {
    private String issueDate;

    public Magazine(String title, String author, String date) {
        super(title, author);
        this.issueDate = date;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String date) {
        this.issueDate = date;
    }

    @Override
    public void displayDetails() {
        System.out.println("Magazine: " + getTitle() + " by " + getAuthor() + ", Issue: " + issueDate);
    }
}

class DVD extends LibraryResource {
    private int duration; // minutes

    public DVD(String title, String author, int duration) {
        super(title, author);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public void displayDetails() {
        System.out.println("DVD: " + getTitle() + " by " + getAuthor() + ", Duration: " + duration + " mins");
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        LibraryResource[] resources = {
                new Book("Java Basics", "John Doe", 350),
                new Magazine("Tech Today", "Jane Smith", "2023-10"),
                new DVD("Learn Programming", "Alice Brown", 120)
        };

        for (LibraryResource res : resources) {
            res.displayDetails();
        }
    }
}