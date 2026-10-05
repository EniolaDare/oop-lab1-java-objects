package ie.atu.oop.week1;

import java.util.ArrayList;
import java.util.List;

public class LibraryService {
    private static final int MAX_LOAN_DAYS = 14;
    private final List<Book> books = new ArrayList<>();

    public boolean loanBook(String title, int loanDays){
        if (loanDays > MAX_LOAN_DAYS || loanDays < 1) throw new IllegalArgumentException("Loan days must be from 1 to " + MAX_LOAN_DAYS + " days");

        Book book = findBookByTitle(title);

        if (book != null){
            book.borrowBook();
            return true;
        }

        return false;
    }
    public boolean returnBook(String title){
        Book book = findBookByTitle(title);

        if (book != null){
            book.returnBook();
            return true;
        }

        return false;
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
    public boolean removeBook(String title){
        Book book = findBookByTitle(title);
        if  (book != null) books.remove(book);
        return (book != null);
    }
}
