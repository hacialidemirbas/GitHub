package Queue_Stack;

import java.util.LinkedList;
import java.util.Queue;

public class First {
    public static void main(String[] args) {
        Queue<Integer>myQueue= new LinkedList<>();
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        myQueue.add(4);
        System.out.println(myQueue);
        System.out.println(myQueue.peek());
        myQueue.poll();
        System.out.println(myQueue);
        myQueue.add(1);
        System.out.println(myQueue);
        System.out.println(myQueue.peek());
        System.out.println(myQueue.element());
    }
}
