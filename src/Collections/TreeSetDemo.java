package Collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> ts=new TreeSet<>();
        ts.add(10);
        System.out.println(ts);
        ts.add(10);
        System.out.println(ts);
        try{
        ts.add(null);}
        catch (NullPointerException e){
            System.out.println("Please do not add 'null'  value");
        }
        System.out.println(ts);
        ts.add(5);
        ts.add(90);
        ts.add(20);
        System.out.println(ts);
        Iterator<Integer> iter = ts.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());}
    }
}
