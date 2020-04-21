package Collections;

import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        //HashSet<String> set= new HashSet<>();
        TreeSet<String> set= new TreeSet<>();// Basically they are same, only difference is TreeSet is alphabetically sorted version of HashSet
        set.add("John");
        set.add("Jack");
        set.add("Jeremy");
        set.add("Tom");
        set.add("Linda");
        set.add("John");
        set.add("Jennie");
        System.out.println("set is : "+set);
        Iterator<String>itr=set.iterator();
        while(itr.hasNext()){
            String str=itr.next();
            System.out.println(str);
        }
        set.remove("John");
        System.out.println("set is after removing 'John' : "+set);
        if(set.contains("Linda")){
            System.out.println("Linda is in the set");

        }
        System.out.println(set.size());

    }
}
