package CollectionReview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class TwoDimArray {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> words = new ArrayList<>();
        ArrayList<String> row = new ArrayList<>(Arrays.asList("Java", "is", "Fun", "Always", "Java", "is", "Fun"));
        for (int i = 0; i < 5; i++) {
            words.add(new ArrayList<>());
            words.get(i).addAll(row);
        }
        for (ArrayList<String> line : words) {
            System.out.println(line);
        }
        Iterator<ArrayList<String>> iterator = words.iterator();
        int counter;
        while (iterator.hasNext()) {
            counter = 0;
            for (String word : iterator.next()) {
                for (int i = 0; i < word.length(); i++) {
                    if (Character.isUpperCase(word.charAt(i))) {
                        counter++;
                    }
                }
            }
            System.out.println("Total Upper for this line " + counter);
        }
        int count;
        HashMap<String,Integer> hm = new HashMap<>();
        for (int i = 0; i < words.size() ; i++) {
            for (int j = 0; j < words.get(i).size() ; j++) {
                count=0;
                System.out.println(words.get(i));
                for (int k = 0; k < words.get(i).get(j).length(); k++) {
                    System.out.println(words.get(i).get(j));
                    if(Character.isUpperCase(words.get(i).get(j).charAt(k))){
                        System.out.println(words.get(i).get(j).charAt(k));
                        count++;
                    }
                }
                hm.put(words.get(i).get(j),count);
            }
        }
        System.out.println(hm);

    }}

