package ie.atu.oop.week1;

import java.io.IOException;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        Book dune = new Book("Dune", "Frank Herbert", 412);
        Book cleanCode = new Book("Clean Code", "Robert C. Martin", 464);

        LibraryService service = new LibraryService();

        service.addBook(dune);
        service.addBook(cleanCode);
        service.loanBook("dune", 7);

        BookFileStore store = new BookFileStore( Path.of("data", "books.csv") );

        try {
            store.save(service.getBooks());
            System.out.println("Saved: " + service.getBookCount());
        } catch (IOException e){
            System.out.println("Save failed: "  + e.getMessage());
        }
    }
}