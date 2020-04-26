package CollectionReview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveDublicates {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>(Arrays.asList(1,2,3,4,3,2,4));
        HashSet<Integer>hs=new HashSet<>();
        hs.addAll(list);
        list.clear();
        list.addAll(hs);
        System.out.println(list);
    }


}
