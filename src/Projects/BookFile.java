package Projects;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BookFile {
    String filePath;

    public BookFile(String filePath) {
        this.filePath = filePath;
    }

    public void createFile(){
        File file = new File(this.filePath);
        try {
            file.createNewFile();
        }
        catch (IOException e){
            System.out.println(e);
        }
        System.out.println("File created");
    }
    public void addBook(Book book) throws IOException{
        FileWriter writer = new FileWriter(this.filePath,true);
        String newBook =  book.getTitle()+","+book.getAuthor()+","+book.getPublisher()+","+book.getPages()+","+book.getYear()+"\n";
        writer.append(newBook);
        writer.close();
    }
    public void displayAllBooks() throws IOException{
        File file = new File(this.filePath);
        Scanner scanner = new Scanner(file);
        System.out.printf("%20s\t%20s\t%15s\t%5s\t%4s\n","Book Title","Author","Publisher","Pages","Year");
        String arr[];
        while (scanner.hasNext()){
            arr = scanner.nextLine().split(",");
            System.out.printf("%20s\t%20s\t%15s\t%5s\t%4s\n",arr[0],arr[1],arr[2],arr[3],arr[4]);
        }
        scanner.close();
    }
    public void displayLostBooks() throws IOException{
        File file = new File(this.filePath);
        Scanner scanner = new Scanner(file);
        System.out.printf("%20s\t%20s\t%15s\t%5s\t%4s\n","Book Title","Author","Publisher","Pages","Year");
        String arr[];
        while(scanner.hasNext()){
            arr = scanner.nextLine().split(",");
            if(arr[5].equals("false")){
                System.out.printf("%20s\t%20s\t%15s\t%5s\t%4s\n",arr[0],arr[1],arr[2],arr[3],arr[4]);
            }
        }
        scanner.close();
    }

}