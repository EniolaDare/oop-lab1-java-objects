package ie.atu.oop.week1;

public class Book {
    private String title;
    private String author;
    private int pageCount;
    private BookStatus status;

    public Book(String title, String author, int pageCount) {
        if (title == null || title.isBlank()) throw new IllegalArgumentException("Title cannot be null or empty");
        if (author == null || author.isBlank()) throw new IllegalArgumentException("Author cannot be null or empty");
        if  (pageCount < 1) throw new IllegalArgumentException("Page count cannot be less than 1");

        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.status = BookStatus.AVAILABLE;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getPageCount() { return pageCount; }
    public BookStatus getStatus() { return status; }

    public void borrowBook(){
        if (status == BookStatus.ON_LOAN) throw new IllegalStateException("Book is already on Loan");
        status = BookStatus.ON_LOAN;
    }
}
