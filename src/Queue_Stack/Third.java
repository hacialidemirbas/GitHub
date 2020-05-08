package Queue_Stack;

import java.util.LinkedList;
import java.util.Queue;

public class Third {
    public static void main(String[] args) {
        Queue<Integer>myQ= new LinkedList<>();
        myQ.add(45);
        myQ.add(78);
        myQ.add(67);
        myQ.add(12);
        System.out.println(myQ);
        System.out.println("With peek()   "+myQ.peek());
        System.out.println("After peek()   "+myQ);
        System.out.println("With poll()   "+myQ.poll());
        System.out.println(myQ.poll());
        System.out.println(myQ.poll());
        System.out.println(myQ.poll());
        System.out.println(myQ.poll());
    }
}
