package ie.atu.oop.week1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
     public static void main(String[] args) {
         Book myBook1 = new Book("Dune", "Frank", 0);
         System.out.println(myBook1.getTitle());
         System.out.println(myBook1.getAuthor());
         System.out.println(myBook1.getPageCount());
     }
}