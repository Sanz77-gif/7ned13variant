package kz.ektu.meiramgazin.sanzhar.lab6;
import java.time.LocalDate;

public class Book {
    private String isbn;
    private String title;
    private String author;
    private String genre;
    private int publicationYear;
    private String publisher;
    private boolean isAvailable;
    private LocalDate dueDate;

    public Book(String isbn, String title, String author, String genre, int publicationYear,
                String publisher, boolean isAvailable, LocalDate dueDate) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publicationYear = publicationYear;
        this.publisher = publisher;
        this.isAvailable = isAvailable;
        this.dueDate = dueDate;
    }

    public String getIsbn() { return isbn; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getGenre() { return genre; }
    public int getPublicationYear() { return publicationYear; }
    public String getPublisher() { return publisher; }
    public boolean isAvailable() { return isAvailable; }
    public LocalDate getDueDate() { return dueDate; }

    public void setIsbn(String isbn) { this.isbn = isbn; }
    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }
    public void setGenre(String genre) { this.genre = genre; }
    public void setPublicationYear(int publicationYear) { this.publicationYear = publicationYear; }
    public void setPublisher(String publisher) { this.publisher = publisher; }
    public void setAvailable(boolean available) { isAvailable = available; }
    public void setDueDate(LocalDate dueDate) { this.dueDate = dueDate; }

    public String toString() {
        return title + " (" + author + ", " + publicationYear + ")";
    }
}

