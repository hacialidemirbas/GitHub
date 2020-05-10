package JavaFiles;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Deduplicate {
    public static void main(String[] args) throws Exception {
        deleteDuplicate("C:\\Users\\hacia\\IdeaProjects\\Second\\duplicate.txt");
    }
    public static void deleteDuplicate(String path) throws Exception{
        File myFile = new File(path);
        Scanner scanner = new Scanner(myFile);
        String duplicateDeleted="";
        String line;
        while(scanner.hasNext()){
            line=scanner.nextLine();
            if (!duplicateDeleted.contains(line)){
                duplicateDeleted+=line+"\n";
            }
        }
        myFile.delete();
        scanner.close();
        FileWriter writer = new FileWriter(path);
        writer.write(duplicateDeleted);
        writer.close();
    }
}
