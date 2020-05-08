package JavaFiles;

import java.io.File;
import java.io.IOException;

public class FirstFile {
    public static void main(String[] args) {
       try{ File myFile=new File("first.txt");
       if(myFile.createNewFile()){
           System.out.println("File created  "+myFile);
       }
       else{
           System.out.println("File already exit");
       }
       }
       catch (IOException e){
           System.out.println(e);
       }
        try{ File myFile=new File("Ali.txt");
            if(myFile.createNewFile()){
                System.out.println("File created  "+myFile);
            }
            else{
                System.out.println("File already exit");
            }
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}
