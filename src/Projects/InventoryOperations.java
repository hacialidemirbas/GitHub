package Projects;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class InventoryOperations {

    public static void insertItems(String path) throws Exception{
        FileWriter writer = new FileWriter(path);
        Scanner scan = new Scanner(System.in);
        String item;
        String answer;
        while (true){
            item = "";
            System.out.print("Product id: ");
            item += scan.nextLine()+",";
            System.out.print("Product name: ");
            item += scan.nextLine()+",";
            System.out.print("Product price: ");
            item += scan.nextLine()+",";
            System.out.print("Quantity: ");
            item += scan.nextLine()+"\n";
            System.out.print("Continue?(Y/N)");
            answer = scan.nextLine();
            writer.append(item);
            if(answer.equalsIgnoreCase("y")){
                break;
            }
        }
        writer.close();
    }
    public static void listInventory(String path) throws Exception{
        File file = new File(path);
        Scanner scan = new Scanner(file);
        String arr[];
        String line;
        while (scan.hasNext()){
            line=scan.nextLine();
            arr=line.split(",");
            System.out.println(scan.nextLine().replaceAll(",","\t\t"));
        }
        scan.close();
    }
    public static void listInventory(String path,String product) throws Exception{
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        String line;
        System.out.println(scanner.nextLine());
        while(scanner.hasNext()){
            line = scanner.nextLine();
            if(line.contains(product)){
                System.out.println(line);
            }

        }
        scanner.close();
    }
    public static void listInventory(String path,int quantity) throws Exception{
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        String line;
        String arr[];
        int qty;
        System.out.printf("%3s \t %15s \t %6s \t %3s \n","id","Product","Price","Qty");
        while(scanner.hasNext()){
            line = scanner.nextLine();
            arr = line.split(",");
            qty = Integer.parseInt(arr[3]);
            if(qty>quantity){
                System.out.printf("%3s \t %15s \t %6s \t %3s \n",arr[0],arr[1],arr[2],arr[3]);
            }
        }
        scanner.close();
    }
    public static void  listTotalQuantity(String path) throws Exception{
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        int total=0;
        String line;
        String arr[];
        int qty;
        while (scanner.hasNext()){
            line = scanner.nextLine();
            arr = line.split(",");
            qty = Integer.parseInt(arr[3]);
            total += qty;
        }
        scanner.close();
        System.out.println("In inventory total "+total+" products listed");
    }


}