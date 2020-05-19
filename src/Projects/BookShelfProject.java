package Projects;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class BookShelfProject {
    public static void main(String[] args) throws IOException {
        //Book book = new Book("aa","b","c",30,200);
        //System.out.println(book.lost);
        Menu bs = new Menu("Book Shelf",new ArrayList<>(Arrays.asList("Add new Book","List All Books","List Lost Books")));
        bs.displayMenu();


    }
}
