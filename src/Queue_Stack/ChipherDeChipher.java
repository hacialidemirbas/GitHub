package Queue_Stack;

import java.util.LinkedList;
import java.util.Queue;

public class ChipherDeChipher {
    public static void main(String[] args) {
        String s="aaaaaa";
        chipher(s);
    }
    public static void chipher(String password){
        Queue<Integer>key= new LinkedList<>();
        key.add(2);
        key.add(1);
        String sifre="";
        char ch;
        for (int i = 0; i < password.length(); i++) {
            ch=password.charAt(i);
            ch+=key.peek();
            sifre+=ch;
            key.add(key.peek());
            key.poll();

        }
        System.out.println(sifre);
    }
}
