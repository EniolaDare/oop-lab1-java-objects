package ie.atu.oop.week1;

import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
     public static void main(String[] args) {
         Book book1 = new Book("Dune", "Frank", 412);
         Book book2 = new Book("Clean Code", "Robert C.Martin", 464);
         Book book3 = new Book("1984", "George Orwell", 382);

         LibraryService service = new LibraryService();

         service.addBook(book1);
         service.addBook(book2);
         service.addBook(book3);

         System.out.println("Total books: " + service.getBookCount());
         for (Book book : service.getAllBooks()) System.out.println(book.getTitle());

         Book found = service.findBookByTitle("Dune");
         if (found != null) System.out.println("Found: " + found.getTitle());

         Book missing = service.findBookByTitle("Animal Farm");
         if (missing == null) System.out.println("Animal Farm not found");
     }
}