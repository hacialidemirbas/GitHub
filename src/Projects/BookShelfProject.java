package Projects;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
public class BookShelfProject {
    public static void main(String[] args) throws IOException {
        BookFile books= new BookFile("books.txt");
        books.createFile();
        books.addBook(new Book("Harry Potter","J K Rowling","Some",500,2000));
        Menu bs= new Menu("Book Shelf",new ArrayList<>(Arrays.asList("List All Books", "List Lost Books")));
        bs.displayMenu();


    }
}
