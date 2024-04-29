package lesson42;

import java.util.Collection;
import java.util.Iterator;

/**
 * AIT-TR, Cohort42.1, Java Basic Lesson #42
 * @author Muklis Hasanov
 * @version 23-Apr-24
 */
public class Lesson42 {
    public static void main(String[] args) {
        LibraryBookRepository repository = new LibraryBookRepository();
        repository.init();
        Collection<LibraryBook> books = repository.values();

        // classic
        long count = 0;
        Iterator<LibraryBook> iterator = books.iterator();
        while (iterator.hasNext()) {
            LibraryBook book = iterator.next();
            if (book.getGenre().equals("Poetry")) {
                count++;
            }
        }
        System.out.println(count);

    // using stream
        count = books.stream()
                .filter(b -> b.getGenre().equals("Poetry"))
                .count();
        System.out.println(count);

    }
}
