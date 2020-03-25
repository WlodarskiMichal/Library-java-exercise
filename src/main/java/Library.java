import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private int capacity;

    public Library(int capacity){
        this.books = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public void add(Book book) {
        if(checkIfThereIsStillPlaceInsideLibrary()){
        this.books.add(book);
        }

    }
    public int countBooksInsideStock(){
        return this.books.size();
    }
    public boolean checkIfThereIsStillPlaceInsideLibrary(){
        if(this.books.size() < this.capacity){
            return true;
        }else{
            return false;
        }
    }
    public Book findNameOfBook(){
        return this.books.get(0);
    }

    public Book lendBook(){
        return this.books.remove(0);
    }

}
