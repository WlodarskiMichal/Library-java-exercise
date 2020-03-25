import java.util.ArrayList;

public class Borrower {
    Library library;
    private ArrayList<Book> booksBorrowed;

    public Borrower(){
        this.booksBorrowed = new ArrayList<Book>();
    }
    public void addBookToCollection(){
        booksBorrowed.add(library.lendBook());
    }
    public int countBooksBorrowed(){
        return this.booksBorrowed.size();
    }
}
