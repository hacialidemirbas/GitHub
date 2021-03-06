package Projects;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private String name;
    private List<String> menuItems;

    public Menu(String name, List<String> menuItems) {
        this.name = name;
        this.menuItems = menuItems;
    }


    public void displayMenu() throws IOException {
        BookFile books = new BookFile("books.txt");
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while(choice !=0) {
            for (int i = 0; i < this.menuItems.size(); i++) {
                System.out.println((i + 1) + "-) " + this.menuItems.get(i));
            }
            System.out.println("0-) Quit");
            System.out.print("Enter your choice : ");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    books.addBook(Info.getBookInfo());
                    break;
                case 2:
                    books.displayAllBooks();
                    break;
                case 3:
                    books.displayLostBooks();
                    break;
                case 4:
                    System.out.println("Your choice is 4");
                    break;
                default:
                    if(choice != 0) {
                        System.out.println("Not menu item");
                    }
                    break;
            }
        }

    }

}


