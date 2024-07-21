import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Author> authors = new ArrayList<>();
        List<Book> books = new ArrayList<>();

        System.out.println("LIBRARY");
        System.out.println("Quantos livros serão adicionados? ");
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {

            System.out.println("Nome: ");
            String name = sc.next();
            System.out.println("Email: ");
            String email = sc.next();

            Author author = new Author(name, email);

            System.out.println("title: ");
            String title = sc.next();
            System.out.println("isbn: ");
            String isbn = sc.next();

            Book book = new Book(title, isbn);
            book.addAuthor(author);
            authors.add(author);
            books.add(book);
        }

        for (Book book : books) {
            System.out.println(book);
        }

        for (Author author : authors) {
            System.out.println(author);
        }
    }
}
