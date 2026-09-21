package ie.atu.oop.week1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Book firstBook = new Book();
        firstBook.title = "Dune";
        firstBook.author = "Frank Herbert";
        firstBook.pageCount = 412;

        firstBook.displayDetails();
    }
}