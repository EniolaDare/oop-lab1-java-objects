package ie.atu.oop.week1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Book firstBook = createBook("Dune", "Frank Herbert", 412);
        Book secondBook = createBook("Clean Code", "Robert C. Martin", 464);
        Book thirdBook = createBook("The C programming Language", "Kernighan and Ritchie", 274);

        firstBook.displayDetails();
        System.out.println("\n");
        secondBook.displayDetails();
        System.out.println("\n");
        thirdBook.displayDetails();
        System.out.println("\n");


        firstBook.borrowBook();
        firstBook.displayDetails();
    }

    private static Book createBook(String title, String author, int pageCount){
        Book book = new Book();
        book.title = title;
        book.author = author;
        book.pageCount = pageCount;
        return book;
    }
}