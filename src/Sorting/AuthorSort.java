package Sorting;

import java.util.Comparator;

public class AuthorSort implements Comparator<Book> {
    public int compare(Book book1, Book book2){
        return book1.getAuthor().compareTo(book2.getAuthor());

    }
}
