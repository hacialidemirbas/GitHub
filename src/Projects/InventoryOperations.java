package Projects;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class InventoryOperations {
    public static void insertItems(String path) throws Exception{
        FileWriter writer= new FileWriter(path);
        Scanner scann= new Scanner(System.in);
        String item;
        String answer;
        while(true){
            item="";
            System.out.println("Product ID : ");
            item+= scann.nextLine()+"\t\t";
            System.out.println("Product name : ");
            item+= scann.nextLine()+"\t\t";
            System.out.println("Product price : ");
            item+= scann.nextLine()+"\t\t";
            System.out.println("Product ID : ");
            item+= scann.nextLine()+"\t\t";
            System.out.println("Quantity : ");
            item+= scann.nextLine()+"\n";
            System.out.println("Continue: Yes or No?");
            answer=scann.next();
            writer.append(item);
            if(answer.equalsIgnoreCase("y")){
                break;
            }
        }
        writer.close();
    }
    public static void listInventory(String path) throws FileNotFoundException {
        File file=new File(path);
        Scanner scan = new Scanner(file);
        while (scan.hasNext()){
            System.out.println(scan.nextLine());
        }
        scan.close();

    }
    public static void listInventory(String path,String product) throws FileNotFoundException {
        File file=new File(path);
        Scanner scan = new Scanner(file);
        String arr[];
        String line;
        while(scan.hasNext()){
            line=scan.nextLine();
            arr=line.split(" ");
            if(arr[1].equalsIgnoreCase(product)){
        }

    }


    }
    public static void listInventory(String path,int quantity){

}}
