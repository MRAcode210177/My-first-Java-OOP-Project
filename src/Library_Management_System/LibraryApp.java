package Library_Management_System;

import java.util.ArrayList;
import java.util.Objects;

// 1. Book Class (Encapsulation and equals/hashCode)
class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // Getters for searching
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }

    // Override equals() and hashCode() based on Title and Author for collection searching
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        // Two books are considered equal if they have the same title AND author
        return Objects.equals(title, book.title) &&
                Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }

    @Override
    public String toString() {
        return String.format("'%s' by %s (%d)", title, author, year);
    }
}

// 2. Library Class (Collection Manager)
class Library {
    private ArrayList<Book> catalogue;

    public Library() {
        this.catalogue = new ArrayList<>();
    }

    // Method 1: Add Book (Checks for duplicates using overridden equals())
    public void addBook(Book book) {
        if (catalogue.contains(book)) {
            System.out.println("❌ Failed to add: " + book + ". A duplicate already exists.");
        } else {
            catalogue.add(book);
            System.out.println("✅ Added to catalogue: " + book);
        }
    }

    // Method 2: Find Book (Linear search)
    public Book findBook(String title) {
        System.out.println("\n--- Searching for: '" + title + "' ---");
        for (Book book : catalogue) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null; // Return null if not found
    }

    // Method 3: List All Books
    public void listAllBooks() {
        if (catalogue.isEmpty()) {
            System.out.println("\nCatalogue is empty.");
            return;
        }
        System.out.println("\n--- Current Library Catalogue (Total: " + catalogue.size() + ") ---");
        for (Book book : catalogue) {
            System.out.println("- " + book);
        }
    }
}

public class LibraryApp {
    public static void main(String[] args) {
        Library myLibrary = new Library();

        Book b1 = new Book("The Code", "J. R. Dev", 2020);
        Book b2 = new Book("Design Patterns", "E. Gamma", 1994);
        Book b_duplicate = new Book("The Code", "J. R. Dev", 2021); // Same title/author, different year

        // Add unique books
        myLibrary.addBook(b1);
        myLibrary.addBook(b2);

        // Try to add duplicate (Testing equals/hashCode)
        myLibrary.addBook(b_duplicate);

        // List all books
        myLibrary.listAllBooks();

        // Find a book
        Book foundBook = myLibrary.findBook("Design Patterns");
        if (foundBook != null) {
            System.out.println("Found book: " + foundBook);
        } else {
            System.out.println("Book not found.");
        }

        // Try to find a book that doesn't exist
        myLibrary.findBook("Non-existent Title");
    }
}


