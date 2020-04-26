package CollectionReview;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListRandomWords {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(10);
        String word = "";
        char rand;
        for (int j = 0; j < 20; j++) {
            for (int i = 0; i < (int) (Math.random() * 11) + 1; i++) {
                rand = (char) (int) ((Math.random() * 26) + 97);
                word += rand;
            }

words.add(word);
        }
        //regular while loop
        int count=0;
        while(count<words.size()){
            System.out.println(words.get(count)+"  ");
        count++;}
        Iterator<String>iter=words.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next()+"   ");
        }

    }
}