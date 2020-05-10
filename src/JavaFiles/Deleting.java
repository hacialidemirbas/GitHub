package JavaFiles;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class Deleting {
    public static void main(String[] args) throws Exception {
        deleteValue("Apple","C:\\Users\\hacia\\IdeaProjects\\Second\\a.txt");
    }
    public static void deleteValue(String value,String path) throws Exception{
        File myFile = new File(path);
        Scanner scanner = new Scanner(myFile);
        String contentFiltered="";
        String line;
        while(scanner.hasNext()){
            line=scanner.nextLine();
            if (!line.equals(value)){
                contentFiltered+=line+"\n";
            }
        }
        myFile.delete();
        scanner.close();
        FileWriter writer = new FileWriter(path);
        writer.write(contentFiltered);
        writer.close();
    }
}
