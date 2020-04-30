package CollectionReview;

import java.util.*;

public class Frequency1 {
    public static void main(String[] args) {
        String sentence = "java is java and we love java";
        System.out.println(Collections.frequency(new ArrayList<>(Arrays.asList(sentence.split(" "))),"java"));
        ArrayList<String> list = new ArrayList<>(Arrays.asList(sentence.split(" ")));
        HashMap<String,Integer> hm = new HashMap<>();
        for(String word : list){
            hm.put(word, Collections.frequency(list,word));
        }
        System.out.println(hm);

    }
}
