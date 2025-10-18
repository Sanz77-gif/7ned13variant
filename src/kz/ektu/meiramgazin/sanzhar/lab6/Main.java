package kz.ektu.meiramgazin.sanzhar.lab6;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        books.add(new Book("111", "Грокаем алгоритмы", "Адитья Бхаргава",
                "Программирование", 2017, "Питер", true, null));

        books.add(new Book("222", "Высоконагруженные приложения. Программирование, масштабирование, поддержка",
                "Мартин Клеппманн", "Программирование", 2021, "Питер", true, null));

        books.add(new Book("333", "Чистый код (Clean Code)", "Роберт К. Мартин",
                "Программирование", 2015, "Питер", false, LocalDate.now()));

        books.add(new Book("444", "Head First Java", "Kathy Sierra, Bert Bates",
                "Обучение", 2019, "O'Reilly", true, null));

        books.add(new Book("555", "Проектирование данных-ориентированных приложений (Designing Data-Intensive Applications)",
                "Мартин Клеппманн", "Программирование", 2022, "O'Reilly", true, null));

        books.add(new Book("666", "Head First Design Patterns", "Эрик Фримен, Элизабет Робсон",
                "Проектирование", 2020, "O'Reilly", true, null));

        books.add(new Book("777", "Java. Эффективное программирование (Effective Java)", "Джошуа Блох",
                "Программирование", 2018, "Addison-Wesley", true, null));

        BookService service = new BookServiceImpl();

        System.out.println("Книги по автору Мартин Клеппманн:");
        service.findBooksByAuthor(books, "Мартин Клеппманн").forEach(System.out::println);

        System.out.println("\nКниги по жанру 'Программирование':");
        service.findBooksByGenre(books, "Программирование").forEach(System.out::println);

        System.out.println("\nКниги, изданные с 2015 по 2022 год:");
        service.findBooksByYear(books, 2015, 2022).forEach(System.out::println);
    }
}

