package src.service;

import src.model.Book;
import src.model.Patron;

public class LendingService {
    public boolean checkoutBook(Book book, Patron patron) {
        if (!book.isAvailable()) {
            System.out.println("Book is not available for checkout.");
            return false;
        }

        book.setAvailable(false);
        patron.addToHistory(book);
        System.out.println(patron.getName() + " has checked out: " + book.getTitle());
        return true;
    }

    public boolean returnBook(Book book) {
        if (book.isAvailable()) {
            System.out.println("Book is already in inventory.");
            return false;
        }

        book.setAvailable(true);
        System.out.println(book.getTitle() + " has been returned.");
        return true;
    }

}
