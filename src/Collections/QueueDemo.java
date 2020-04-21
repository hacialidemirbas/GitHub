package Collections;

import java.util.PriorityQueue;

public class QueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer>queue= new PriorityQueue<>();
for(int i=10; i>0;i--){
    queue.add(i);
}
        System.out.println(queue.size());
        System.out.println(queue.peek());
queue.poll();
        System.out.println(queue.peek());
        System.out.println(queue.size());
    }
}
