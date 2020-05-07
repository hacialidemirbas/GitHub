package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookTest {
    public static void main(String[] args) {
        List<Book> book=new ArrayList<>();
        book.add(new Book("CAMINO WINDS","John Grisham",555));
        book.add(new Book("IF IT BLEEDS","Stephen King",444));
        book.add(new Book("LITTLE FIRES EVERYWHERE","Celeste Ng",505));
        System.out.println("Sorting acording to Title\n===============================");
        Collections.sort(book,new TitleSort());
        for(Book b:book){
            System.out.println(b.getTitle()+"\t"+b.getAuthor());}
        System.out.println("Sorting acording to Author\n===============================");
        Collections.sort(book,new AuthorSort());
        for(Book b:book){
            System.out.println(b.getAuthor()+"\t"+b.getTitle());}
        System.out.println("Sorting acording to Page\n===============================");
        Collections.sort(book,new PageSort());
        for(Book b:book){
            System.out.println(b.getPage()+b.getAuthor()+"\t"+b.getTitle());}
    }

}
