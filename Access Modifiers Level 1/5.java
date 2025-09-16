class Book {
    public String ISBN;
    protected String title;
    private String author;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class EBook extends Book {
    private double fileSize;

    public EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    public void displayEBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + getAuthor());
        System.out.println("File Size: " + fileSize + " MB");
    }
}

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("978-1234567890", "Java Basics", "James Gosling");
        b1.displayBookDetails();

        System.out.println();

        EBook eb1 = new EBook("978-0987654321", "Advanced Java", "Herbert Schildt", 5.2);
        eb1.displayEBookDetails();

        System.out.println("\nUpdating Author...");
        eb1.setAuthor("Updated Author");
        eb1.displayEBookDetails();
    }
}
