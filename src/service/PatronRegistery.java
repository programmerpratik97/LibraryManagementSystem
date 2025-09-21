package src.service;

import src.model.Patron;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PatronRegistery {
    private final Map<String, Patron> patrons = new HashMap<>();

    public void addPatron(Patron patron) {
        patrons.put(patron.getId(), patron);
    }

    public void updatePatron(Patron patron) {
        patrons.put(patron.getId(), patron);
    }

    public Patron getPatronById(String id) {
        return patrons.get(id);
    }

    public Collection<Patron> getAllPatrons() {
        return patrons.values();
    }

}
