package Queue_Stack;

import java.util.LinkedList;
import java.util.Queue;

public class CeaserCipher {
    public static void main(String[] args) {
        Queue<Integer>q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        int value;
        for (int i = 0; i <10 ; i++) {
            value=q.poll();
            System.out.print("Removed:"+value+"\tQueue:"+q);
            q.add(value);
            System.out.println("\t After added:"+q);

        }
    }
}
