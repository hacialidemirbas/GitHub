package CollectionReview;

import java.util.*;
import java.util.Arrays;
import java.util.Comparator;

public class ReverseIntArrAyList {
    public static void main(String[] args) {
        ArrayList<Integer>arrList= new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Collections.sort(arrList, Comparator.reverseOrder());
        System.out.println(arrList);
        ArrayList<String>fruits= new ArrayList<>(List.of("Banana","Apple","Peach","Orange"));
        Collections.sort(fruits,Comparator.reverseOrder());
        System.out.println(fruits);
        String x="";
        for(int i=0; i<fruits.size();i++){
            StringBuilder reversed=new StringBuilder(fruits.get(i));
            reversed.reverse();
            reversed.toString();
            x+=reversed;
            fruits.set(i,x);
            x="";
        }
        System.out.println(fruits);
    }
}
