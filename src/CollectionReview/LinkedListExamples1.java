package CollectionReview;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExamples1 {
    public static void main(String[] args) {
        LinkedList<String>sentence=new LinkedList<String>(Arrays.asList("Java", "is","extremly", "fun"));
        List<Integer> length= new LinkedList<>();
        for(String word:sentence){
            length.add(word.length());

        }
        System.out.println(sentence);
        System.out.println(length);
        int index=length.indexOf(Collections.max(length));
        System.out.println("The largest word is : "+sentence.get(index)+"\""+" with the length of "+length.get(index));
        index=length.indexOf(Collections.min(length));
        System.out.println("The shortest word is : "+sentence.get(index)+"\""+" with the length of "+length.get(index));
    }



}
