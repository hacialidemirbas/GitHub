package Projects;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BookFile {
    String filePath;

    public BookFile(String filePath) {
        this.filePath = filePath;
    }
    public void createFile(){
        File file= new File(this.filePath);
        try {
            file.createNewFile();
        }
        catch(IOException e){
            System.out.println(e);
        }
        System.out.println("File created");
    }
    public void addBook(Book book) throws IOException {
        FileWriter writer= new FileWriter(this.filePath,true);
        String newBook=book.getTitle()+","+book.getAuthor()+","+book.getPublisher()+","+book.getPages()+","+book.getYear()+"\n";
        writer.append(newBook);
        writer.close();

    }
}
