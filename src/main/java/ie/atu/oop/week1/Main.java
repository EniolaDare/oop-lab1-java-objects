package ie.atu.oop.week1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
     public static void main(String[] args) {
         Book myBook = new Book("Dune", "Frank", 412);
         myBook.borrowBook();
         myBook.returnBook();

         try {
             myBook.returnBook();

         } catch (IllegalStateException e) {
             System.out.println("Error: " + e.getMessage());
         }

         System.out.println(myBook.getStatus());
     }
}