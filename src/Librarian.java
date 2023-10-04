import java.util.ArrayList;

public class Librarian {

    //Arrays need to be changed from String to classes
    private ArrayList<String> bookList;
    private ArrayList<String> availableBooks;
    private ArrayList<String> borrowedBooks;
    private ArrayList<String> users;

    public Librarian() {
        this.bookList = new ArrayList<>();
        this.availableBooks = new ArrayList<>();
        this.borrowedBooks = new ArrayList<>();
        this.users = new ArrayList<>();
    }
}
