package Sorting;

import java.util.Comparator;

public class PageSort implements Comparator<Book> {
    public int compare(Book b1, Book b2){
        if(b1.getPage()==b2.getPage()){
            return 0;
        }
        else if(b1.getPage()>b2.getPage()){
            return 1;
        }
        else{
            return -1;
        }
    }
}
