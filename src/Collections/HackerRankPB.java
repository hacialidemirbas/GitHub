package Collections;

import java.util.HashMap;
import java.util.Scanner;

public class HackerRankPB { public static void main(String[] args) {
    HashMap<String, Integer> phoneBook = new HashMap<>();
    Scanner scn = new Scanner(System.in);
    String name;
    int number;
    for(int i=0 ; i<3 ; i++){
        System.out.print("Enter name: ");
        name = scn.next();
        System.out.print("Enter phone number: ");
        number = scn.nextInt();
        phoneBook.put(name,number);
    }
    //System.out.println(phoneBook);
    String nameToFind;
    for(int i=0 ; i<3 ; i++){
        System.out.print("Which name : ");
        nameToFind=scn.next();
        if(phoneBook.containsKey(nameToFind)){
            System.out.println(nameToFind+"="+phoneBook.get(nameToFind));
        }
        else{
            System.out.println("Not found");
        }
    }
}
}
