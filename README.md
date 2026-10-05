#   LAB 1
Book Tracker Application
Application that stores and tracks book details and status
firstBook: .title = "Dune" .author = "Frank Herbert" .pageCount = 412 .available = fals

#   LAB 3
The fifteen-day call does not track book.borrowBook() because, when LibraryService.loanBook() is called, it checks the loanDays argument against MAX_LOAN_DAYS, loanDays (15) > MAX_LOAN_DAYS(14) which causes a IllegalArgumentException to be thrown before book.borrowBook() can be called. 
In the seven-day call, at the same point, loanDays (7) < MAX_LOAN_DAYS(14), no exception is thrown, and book.borrowBook() is called.

- JDK=24, package=ie.atu.oop.week1;
- if argument is null, calling isBlank() will crash program as if argument is null it will not have a isBlank() method as it does not exist in memory
- status is not made final as its value will change during the course of the program while title, author and pageCount are made final because for each book object, they will not change during the program.
- this prevents caller from changing book status before checking whether the desired status change is allowed, using borrow & return functions check weather a book can be borrowed/returned before changing the book status.
- 1) book: - argument checks (author+title+pageCount) for constructor to make sure none of the arguments are null/empty/<1
           - status check before borrowing/returning books
  2) libraryService: - check if book argument is null
                     - check if maximum loan days are exceeded
- after sucessfull loan: book status = AVAILABLE->ON_LOAN->AVAILABLE (no error)
  after rejected loan: book status = remains AVAILABLE (error)
  after rejected return: book status = remains ON_LOAN  (error)
  after maven build: [INFO] BUILD SUCCESS
- n/a

# LAB 4
- LibraryService single book -> List<Book>
- List<Book> tells compiler to create an ordered collection of Book objects
- final only prevents books from being reassigned to another ArrayList and does not freeze the ArrayList books points to
- An enhanced for loop allows the iteration of an array, by directly iteration over each object in the collection, indexing and counting are handled behind the scenes as compared to a normal for loop where indexing is done manually
- findBookByTitle: known title - returns book object, unknown title - return null
- using findBookByTitle instead of writing a loop make code more efficient and shoter
- 1) Main: create libraryService and book objects, call libraryService methods, print results
  2) LibraryService: handles book list, book search, book loans + loan durations, book returns, adding books, removing books 
  3) Book: encapsulated book attributes, status checks for book loans and returns
- BUILD SUCCESS, final count = 2, n/a