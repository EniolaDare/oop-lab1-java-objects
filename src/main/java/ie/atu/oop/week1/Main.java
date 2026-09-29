package ie.atu.oop.week1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
     public static void main(String[] args) {
         Book book1 = new Book("Dune", "Frank", 412);
         Book book2 = new Book("Clean Code", "Robert C.Martin", 464);
         LibraryService service = new LibraryService();

         System.out.println(book1.getStatus());
         service.loanBook(book1, 7);
         System.out.println(book1.getStatus());
         service.returnBook(book1);
         System.out.println(book1.getStatus());
         System.out.println(book2.getStatus());

         try {
             service.loanBook(book1, 15);

         } catch (IllegalArgumentException e) {
             System.out.println("Error: " + e.getMessage());
         }

         System.out.println(book1.getStatus());
     }
}