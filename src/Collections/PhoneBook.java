package Collections;

import java.util.Iterator;
import java.util.TreeSet;

public class PhoneBook {
    public static void main(String[] args) {

    TreeSet<String> phoneBook= new TreeSet<>();
        phoneBook.add("John:555123456");
        phoneBook.add("Jack:555234567");
        phoneBook.add("Jeremy:555345678");
        phoneBook.add("Tom:555456789");
        phoneBook.add("Linda:555567890");
        phoneBook.add("John:555678901");
        phoneBook.add("Ali:555789123");
        phoneBook.add("Jennie:555789234");
        phoneBook.add("Jennie:555789345");
        phoneBook.add("Jennie:555789456");
        System.out.println("phonebook is : "+phoneBook);
    Iterator<String> itr=phoneBook.iterator();
        while(itr.hasNext()){
        String str=itr.next();
        System.out.println(str);
    }

}
}
