package JavaFiles;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) throws Exception{
        FileWriter writer=new FileWriter("data.txt");
        writer.write("Chips \t $2.99\n");
        writer.write("Apple \t $1.49\n");
        writer.write("Candy \t $1.19\n");
        writer.close();
        File read=new File("data.txt");
        Scanner scanner=new Scanner(read);
        while(scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }
        //Print only products starts with "A"
        scanner.close();
        Scanner scan = new Scanner(read);
        String line;
        while (scan.hasNext()){
            line = scan.nextLine();
            if(line.charAt(0)=='A'){
                System.out.println(line);
            }
        }
        scan.close();
        Scanner scanner1=new Scanner(read);
        int totalChars=0;
        while(scanner1.hasNext()){
            totalChars+=scanner1.nextLine().length();
        }
        System.out.println("Total chars :"+totalChars);
        scanner1.close();
        Scanner scanner2= new Scanner(read);
        int totalLines=0;
        while(scanner2.hasNext()){
            scanner2.nextLine();
            totalLines++;
        }
        System.out.println("Total products  :  "+totalLines);
        scanner2.close();

    }
}
