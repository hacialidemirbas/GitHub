package JavaFinalReview;

import java.io.File;
import java.io.IOException;

public class ExceptionsExample {
    public static void main(String[] args) throws IOException {
        File file= new File("exception.txt");
        file.createNewFile();
        try{System.out.println("exception".charAt(1));} catch (Exception e) {
            //
            System.out.println("something is wrong");
        }

    }
    public static void exceptions(String []arr){

    }

}
