package ie.atu.oop.week1;

import java.util.ArrayList;
import java.util.List;

public class LibraryService {
    private static final int MAX_LOAN_DAYS = 14;
    private final List<Book> books = new ArrayList<>();

    public void loanBook(Book book, int loanDays){
        if (book == null) throw new IllegalArgumentException("Book must not be null");
        if (loanDays > MAX_LOAN_DAYS || loanDays < 1) throw new IllegalArgumentException("Loan days must be from 1 to " + MAX_LOAN_DAYS + " days");

        book.borrowBook();
    }
    public void returnBook(Book book){
        if (book == null) throw new IllegalArgumentException("Book must not be null");
        book.returnBook();
    }

    public void addBook(Book book){
        if (book == null) throw new IllegalArgumentException("Book must not be null");
        books.add(book);
    }
    public int getBookCount(){
        return books.size();
    }
    public List<Book> getAllBooks(){
        return new ArrayList<>(books);
    }

    public Book findBookByTitle(String title){
        for (Book book : books) {
            if (book.getTitle().equals(title)) return book;
        }
        return null;
    }

}
