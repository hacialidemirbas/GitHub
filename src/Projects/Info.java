package Projects;

import java.util.Scanner;

public class Info {
    public static Book getBookInfo(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter title: ");
        String title = scanner.nextLine();
        System.out.println("Please enter Author: ");
        String author = scanner.nextLine();
        System.out.println("Please enter Publisher: ");
        String publisher = scanner.nextLine();
        System.out.println("Please enter number of pages: ");
        int pages = scanner.nextInt();
        System.out.println("Please enter year: ");
        int year = scanner.nextInt();
        Book newBook = new Book(title,author,publisher,pages,year);
        return newBook ;

    }
}
