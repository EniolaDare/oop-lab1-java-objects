package ie.atu.oop.week1;

public class Book {
    public String title;
    public String author;
    public int pageCount;
    public boolean available = true;

    public void displayDetails(){
        System.out.println("Book title: " + title);
        System.out.println("Book Author: " + author);
        System.out.println("Book PageCount: " + pageCount);
        System.out.println("Book Available: " + available);
    }

    public void borrowBook(){
        if (available){
            available = false;
            System.out.println(title + " has been borrowed");
        } else {
            System.out.println(title + " is already on loan");
        }
    }
}
