package src.service;

import src.model.Book;

import java.util.ArrayList;
import java.util.List;

public class SearchService {
    private final LibraryInventory inventory;

    public SearchService(LibraryInventory inventory) {
        this.inventory = inventory;
    }

    public List<Book> searchByTitle(String title) {
        List<Book> results = new ArrayList<>();
        for (Book book : inventory.getAllBooks()) {
            if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
                results.add(book);
            }
        }
        return results;
    }

    public List<Book> searchByAuthor(String author) {
        List<Book> results = new ArrayList<>();
        for (Book book : inventory.getAllBooks()) {
            if (book.getAuthor().toLowerCase().contains(author.toLowerCase())) {
                results.add(book);
            }
        }
        return results;
    }

    public Book searchByIsbn(String isbn) {
        return inventory.getBookByIsbn(isbn);
    }

}
