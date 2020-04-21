package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionsMethods {
    public static void main(String[] args) {
        List fruits=new ArrayList();
        Collections.addAll(fruits,"Apples","Oranges","Bananas");
        fruits.forEach(System.out::println);
        System.out.println("============Alternative way=================");
        Iterator<String>itr=fruits.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
