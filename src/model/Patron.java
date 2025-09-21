package src.model;

import java.util.*;

public class Patron {
    private final String id;
    private String name;
    private final List<Book> borrowingHistory = new ArrayList<>();

    public Patron(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public void addToHistory(Book book) {
        borrowingHistory.add(book);
    }

    public List<Book> getBorrowingHistory() {
        return Collections.unmodifiableList(borrowingHistory);
    }

    @Override
    public String toString() {
        return String.format("Patron[%s: %s]", id, name);
    }

}
