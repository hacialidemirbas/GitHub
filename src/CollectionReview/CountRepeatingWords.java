package CollectionReview;

import java.util.HashMap;

public class CountRepeatingWords {
    public static void main(String[] args) {
        String sentence="Java is our love and we love java";
        System.out.println(findFrequencies(sentence));
        findRepeatedWords(sentence);

    }
    public static HashMap<String,Integer> findFrequencies(String sentence){
        HashMap<String,Integer>hm= new HashMap<>();
        String words[]=sentence.split("");
        for(String word:words){
            if (hm.containsKey(word)){
                hm.put(word,hm.get(word)+1);
            }
            else{
                hm.put(word,1);
            }
        }
        return hm;
    }
    public static void findRepeatedWords(String sentence){
        HashMap<String,Integer>hm=findFrequencies(sentence);
        for (String key:hm.keySet()){
            if(hm.get(key)>1){
                System.out.println(key+"="+hm.get(key));
            }
        }

    }
    }

