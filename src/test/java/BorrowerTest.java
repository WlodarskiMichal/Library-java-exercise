import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Library library;
    Book book;
    Borrower borrower;
    @Before
    public void before(){
        book = new Book("Harry potter", "Rowling", "Fantasy");
        library = new Library(10);
        borrower = new Borrower();

    }
    @Test
    public void canLendBook(){
        library.add(book);
        library.lendBook();
        borrower.addBookToCollection();
        assertEquals(1, borrower.countBooksBorrowed());
    }
}
