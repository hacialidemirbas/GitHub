package CollectionReview;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList4 {
    public static void main(String args[]){

        LinkedList<String> ll=new LinkedList<String>();
        ll.add("Ravi");
        ll.add("Vijay");
        ll.add("Ajay");
        //Traversing the list of elements in reverse order
        Iterator i=ll.descendingIterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        Iterator<String>itr=ll.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        Iterator itr1=ll.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }
    }
}
