#   LAB 1
Book Tracker Application
Application that stores and tracks book details and status
firstBook: .title = "Dune" .author = "Frank Herbert" .pageCount = 412 .available = fals

#   LAB 3
The fifteen day call does not reack book.borrowBook() because, when LibraryService.loanBook() is called, it check the loanDays argument against MAX_LOAN_DAYS, loanDays (15) > MAX_LOAN_DAYS(14) which causes a IllegalArgumentException to be thrown before book.borrowBook() can be called. 
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