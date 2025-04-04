import java.util.ArrayList;
import java.util.List;

public class LibraryBookCompositionExample {
    public static void main(String[] args) {
        Book book1 = new Book(1221,"Can we be strangers again?","Shrijeet Shandilya ");
        Book book2 = new Book(1331,"Death on the Nile","Udgam Trivedi");

        Library library = new Library();

        library.addBooks(book1);
        library.addBooks(book2);

        library.showBooks();
    }
}
class Library{

    private List<Book> bookList;

    public Library() {
        this.bookList = new ArrayList<>();
    }

    public void addBooks(Book book){
        bookList.add(book);
    }

    public void showBooks(){
        for (Book book : bookList){
            System.out.println("Book Details: " + "Book Id: " + book.getBookId()
                    + " Book Name: " + book.getBookName() + "Author Name: " + book.getAuthorName());
        }
    }
}

class Book{

    private int bookId;
    private String bookName;
    private String authorName;

    public Book(int bookId, String bookName, String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }
}