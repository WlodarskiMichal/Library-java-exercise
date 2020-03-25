import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Book book;
    Library library;

    @Before
    public void before(){
        book = new Book("Harry potter", "Rowling", "Fantasy");
        library = new Library(30);
    }
    @Test
    public void canAddBook(){
        library.add(book);
        assertEquals(1, library.countBooksInsideStock());
    }
    @Test
    public void canAddMultipleBooksUnderMaxCapacity(){
        library.add(book);
        library.add(book);
        library.add(book);
        library.add(book);
        assertEquals(true, library.checkIfThereIsStillPlaceInsideLibrary());
    }
    @Test
    public void cannotAddAboveCapacity(){
        Library miniLibrary = new Library(1);
        miniLibrary.add(book);
        miniLibrary.add(book);
        assertEquals(false, miniLibrary.checkIfThereIsStillPlaceInsideLibrary());

    }
    @Test
    public void canCheckNameOfBook(){
        library.add(book);
        assertEquals("Harry potter", library.findNameOfBook().title());
    }
    @Test
    public void canLendBook(){
        library.add(book);
        library.lendBook();
        assertEquals(0, library.countBooksInsideStock());
    }
}
