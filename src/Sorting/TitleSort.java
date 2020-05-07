package Sorting;

import java.util.Comparator;

public class TitleSort implements Comparator<Book> {
    public int compare(Book book1, Book book2){
        return book1.getTitle().compareTo(book2.getTitle());

    }
}
