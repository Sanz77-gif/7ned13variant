package kz.ektu.meiramgazin.sanzhar.lab6;
import java.util.List;

public interface BookService {
    List<Book> findBooksByAuthor(List<Book> books, String author);
    List<Book> findBooksByGenre(List<Book> books, String genre);
    List<Book> findBooksByYear(List<Book> books, int minYear, int maxYear);
}
