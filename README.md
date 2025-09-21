# LibraryManagementSystem

A simple, modular, and extensible Library Management System written in Java. This project applies OOP principles, SOLID design, and uses design patterns to manage books, patrons, and lending operations in a clean and maintainable way.

Design Patterns Used
Facade Pattern: LibrarySystem provides a unified interface to library operations

                    +------------------+
                    |    Book          |
                    +------------------+
                    | - isbn           |
                    | - title          |
                    | - author         |
                    | - publicationYr  |
                    | - isAvailable    |
                    +------------------+

                    +------------------+
                    |    Patron        |
                    +------------------+
                    | - id             |
                    | - name           |
                    | - borrowingHist  |
                    +------------------+

                          ▲
                          |
                          | references
                          |

                    +------------------+
                    | LendingService   |
                    +------------------+
                    | +checkoutBook()  |
                    | +returnBook()    |
                    +------------------+

+------------------+     +------------------+     +------------------+
|LibraryInventory  |     | PatronRegistry   |     | SearchService    |
+------------------+     +------------------+     +------------------+
| - books: Map<>   |     | - patrons: Map<> |     | - inventory      |
| +addBook()       |     | +addPatron()     |     | +searchByTitle() |
| +removeBook()    |     | +getPatronById() |     | +searchByAuthor()|
| +getBookByIsbn() |     +------------------+     | +searchByIsbn()  |
+------------------+                             +------------------+

                    +------------------+
                    | LibrarySystem    |
                    +------------------+
                    | - inventory      |
                    | - registry       |
                    | - lendingService |
                    | - searchService  |
                    | +checkoutBook()  |
                    | +returnBook()    |
                    | +searchBooks()   |
                    +------------------+

                    +------------------+
                    | Main             |
                    +------------------+
                    | +main()          |
                    +------------------+

