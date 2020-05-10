package Queue_Stack;

import java.util.LinkedList;
import java.util.Queue;

public class DeCeacarCipher {
    public static void main(String[] args) {
        System.out.println(deCeasarCipher("Mb}e\"nv!myp"));
    }
    public static String deCeasarCipher(String word){
        String result="";
        Queue<Integer> key=  new LinkedList<>();
        key.add(3);
        key.add(1);
        key.add(7);
        key.add(4);
        key.add(2);
        key.add(5);
        char ch;
        int keyValue;
        for (int i = 0; i <word.length() ; i++) {
            ch=word.charAt(i);
          /*  keyValue = key.poll();
            ch -= keyValue;
            result += ch;
            key.add(keyValue);*/
            ch-=key.peek();
            result+=ch;
            key.add(key.peek());
            key.poll();
        }

        return result;
    }
}
