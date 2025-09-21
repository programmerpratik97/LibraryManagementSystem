package src.service;

import src.model.Book;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class LibraryInventory {
    private final Map<String, Book> books = new HashMap<>();

    public void addBook(Book book) {
        books.put(book.getIsbn(), book);
    }

    public void removeBook(String isbn) {
        books.remove(isbn);
    }

    public void updateBook(Book updatedBook) {
        books.put(updatedBook.getIsbn(), updatedBook);
    }

    public Book getBookByIsbn(String isbn) {
        return books.get(isbn);
    }

    public Collection<Book> getAllBooks() {
        return books.values();
    }

}
