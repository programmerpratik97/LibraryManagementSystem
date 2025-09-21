package src;

import src.model.Book;
import src.model.Patron;
import src.service.LendingService;
import src.service.LibraryInventory;
import src.service.PatronRegistery;
import src.service.SearchService;

import java.util.List;

public class LibrarySystem {
    private final LibraryInventory inventory = new LibraryInventory();
    private final PatronRegistery patronRegistry = new PatronRegistery();
    private final LendingService lendingService = new LendingService();
    private final SearchService searchService = new SearchService(inventory);

    // Facade methods
    public void addBook(Book book) { inventory.addBook(book); }
    public void removeBook(String isbn) { inventory.removeBook(isbn); }
    public void updateBook(Book book) { inventory.updateBook(book); }

    public void registerPatron(Patron patron) { patronRegistry.addPatron(patron); }
    public void updatePatron(Patron patron) { patronRegistry.updatePatron(patron); }

    public void checkoutBook(String isbn, String patronId) {
        Book book = inventory.getBookByIsbn(isbn);
        Patron patron = patronRegistry.getPatronById(patronId);
        if (book != null && patron != null) {
            lendingService.checkoutBook(book, patron);
        }
    }

    public void returnBook(String isbn) {
        Book book = inventory.getBookByIsbn(isbn);
        if (book != null) {
            lendingService.returnBook(book);
        }
    }

    public void searchBooks(String keyword, String type) {
        List<Book> results;
        switch (type.toLowerCase()) {
            case "title":
                results = searchService.searchByTitle(keyword);
                break;
            case "author":
                results = searchService.searchByAuthor(keyword);
                break;
            case "isbn":
                Book found = searchService.searchByIsbn(keyword);
                results = found != null ? List.of(found) : List.of();
                break;
            default:
                results = List.of();
        }

        results.forEach(System.out::println);
    }

}
