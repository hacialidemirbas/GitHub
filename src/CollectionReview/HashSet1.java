package CollectionReview;

import java.util.HashSet;

public class HashSet1 {
    public static void main(String args[]){
        String sentence="java is java";

        //Creating HashSet and adding elements
        HashSet<String> hs=new HashSet();
        String[]words=sentence.split(" ");
        for(String word:words){
            hs.add(word);
        }
        System.out.println(hs);

    }
}
