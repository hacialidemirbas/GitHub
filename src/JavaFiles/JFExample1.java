package JavaFiles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class JFExample1 {
    public static void main(String[] args) throws IOException {
        FileWriter fw= new FileWriter("C:\\Users\\hacia\\IdeaProjects\\Second\\fw.txt");
        fw.write("Ali \t\t95\n");
        fw.write("Veli\t\t96\n");
        fw.write("Hasan\t\t97\n");
        fw.write("Ayse\t\t98\n");
        fw.write("Fatma\t\t99\n");
        fw.write("Huseyin\t\t100\n");
        fw.write("Ali \t\t99\n");
        fw.write("Hasan\t\t98\n");
        fw.write("Veli\t\t97\n");
        fw.close();
        File fl= new File("C:\\Users\\hacia\\IdeaProjects\\Second\\fw.txt");
        Scanner scanner= new Scanner(fl);

        while(scanner.hasNext()){
           System.out.println(scanner.nextLine());
        }
        scanner.close();
        // lines starting with 'A'
        Scanner scan= new Scanner(fl);
        String line;
        while(scan.hasNext()){
            line=scan.nextLine();
            if(line.charAt(0)=='A'){
            System.out.println(line);}
        }
        scan.close();
        //Total number of characters
        Scanner sn= new Scanner(fl);
        int total=0;
        int totalLines=0;
        while(sn.hasNext()){
            total+=sn.nextLine().length();
            totalLines++;
                                }
        sn.close();

        //System.out.println(total);
        System.out.println(totalLines);
        FileWriter fw1= new FileWriter("C:\\Users\\hacia\\IdeaProjects\\Second\\fw1.txt");
        fw1.write("John\t\t96\n");
        fw1.write("Mary\t\t96\n");
        fw1.write("David\t\t96\n");
        fw1.write("Rose\t\t96\n");
        fw1.close();
        //Scanner a= new Scanner("C:\\Users\\hacia\\IdeaProjects\\Second\\fw.txt");
        File merge2= new File("C:\\Users\\hacia\\IdeaProjects\\Second\\fw1.txt");
        Scanner b= new Scanner(merge2);
        File merge1= new File("C:\\Users\\hacia\\IdeaProjects\\Second\\fw.txt");
        Scanner a= new Scanner(merge1);
        FileWriter fwab=new FileWriter("C:\\Users\\hacia\\IdeaProjects\\Second\\merged.txt");
        String contentB="";
        String contentA="";
        while(b.hasNext()){
            contentB+=b.nextLine()+"\n";
        }
        while(a.hasNext()){
            contentA+=a.nextLine()+"\n";
        }
        fwab.write(contentA+contentB);
b.close();
        a.close();
        fwab.close();

    }
}
