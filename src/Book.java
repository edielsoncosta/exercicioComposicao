import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private String isbn;

    List<Author> authors = new ArrayList<>();

    public Book(String title, String isbn) {
        this.title = title;
        this.isbn = isbn;
        this.authors = new ArrayList<>();
    }

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public void removeAuthor(Author author) {
        authors.remove(author);
    }

    public String toString() {
        return "title: " +
                title + " - "  + isbn;
    }
}
