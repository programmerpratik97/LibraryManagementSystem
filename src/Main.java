package src;

import src.model.Book;
import src.model.Patron;

public class Main {
    public static void main(String[] args) {
        LibrarySystem library = new LibrarySystem();

        // Add Books
        Book b1 = new Book("123", "The God of Small Things", "Arundhati Roy", 2010);
        Book b2 = new Book("456", "The Guide", "R. K. Narayan", 2012);
        library.addBook(b1);
        library.addBook(b2);

        // Add Patron
        Patron p1 = new Patron("P001", "Abhi");
        library.registerPatron(p1);

        // Checkout Book
        library.checkoutBook("123", "P001");

        // Return Book
        library.returnBook("123");

        // Search Books
        library.searchBooks("god", "title");
        library.searchBooks("Narayan", "author");
        library.searchBooks("456", "isbn");
    }

}
