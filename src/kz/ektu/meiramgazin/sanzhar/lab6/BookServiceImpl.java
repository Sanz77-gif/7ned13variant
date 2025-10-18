package kz.ektu.meiramgazin.sanzhar.lab6;
import java.util.*;
import java.util.stream.Collectors;
public class BookServiceImpl implements BookService {

    public List<Book> findBooksByAuthor(List<Book> books, String author) {
        if (books == null || author == null) return Collections.emptyList();

        return books.stream()
                .filter(b -> author.equalsIgnoreCase(b.getAuthor()))
                .sorted(Comparator.comparingInt(Book::getPublicationYear).reversed())
                .collect(Collectors.toList());
    }

    public List<Book> findBooksByGenre(List<Book> books, String genre) {
        if (books == null || genre == null) return Collections.emptyList();

        return books.stream()
                .filter(b -> genre.equalsIgnoreCase(b.getGenre()))
                .sorted(Comparator.comparingInt(Book::getPublicationYear).reversed())
                .collect(Collectors.toList());
    }

    public List<Book> findBooksByYear(List<Book> books, int minYear, int maxYear) {
        if (books == null) return Collections.emptyList();

        return books.stream()
                .filter(b -> b.getPublicationYear() >= minYear && b.getPublicationYear() <= maxYear)
                .sorted(Comparator.comparingInt(Book::getPublicationYear).reversed())
                .collect(Collectors.toList());
    }
}