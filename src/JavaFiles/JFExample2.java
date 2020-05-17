package JavaFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class JFExample2 {
    public static void main(String[] args) throws Exception {
        try {
            //System.out.println(findValue("John","C:\\Users\\hacia\\IdeaProjects\\Second\\merged.txt"));
            System.out.println(deleteValue("Ali","C:\\Users\\hacia\\IdeaProjects\\Second\\merged.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static String findValue(String value, String filePath) throws FileNotFoundException {
        Scanner newScanner= new Scanner(new File(filePath));
        String word;
        String result="";
        while(newScanner.hasNext()){
            word=newScanner.nextLine();
            if (word.contains(value)){
            result=word;
            }
        }
        return result;

    }
    public static String deleteValue(String value, String path) throws  Exception{
        Scanner sn= new Scanner(new File(path));
        String filtered="";
        String line;
        while(sn.hasNext()){
            line=sn.nextLine();
            if(!line.contains(value)){
             filtered+=line+"\n";

            }
        }
        sn.close();
        return filtered;
    }
}
