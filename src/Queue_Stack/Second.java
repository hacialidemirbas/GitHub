package Queue_Stack;

import java.util.LinkedList;
import java.util.Queue;

public class Second {
    public static void main(String[] args) {
        Queue<String> myQueue= new LinkedList<>();
        myQueue.add("Ali");
        myQueue.add("Veli");
        myQueue.add("Hasan");
        myQueue.add("Huseyin");
        myQueue.add("Ayse");
        myQueue.add("Fatma");
        System.out.println("Before   "+myQueue);
        for (int i = 0; i < 6; i++) {
            System.out.println(myQueue.poll());
        }
        System.out.println("After   "+myQueue);

    }
}
