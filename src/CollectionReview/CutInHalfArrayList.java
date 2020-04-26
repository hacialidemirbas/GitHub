package CollectionReview;

import java.util.ArrayList;
import java.util.Arrays;

public class CutInHalfArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrList= new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        ArrayList<Integer> half= new ArrayList<>();
        for(int i=0;i<arrList.size()/2;i++){
            half.add(arrList.get(i));
            //arrList.remove(arrList.get(i));
        }
        System.out.println(half);
        System.out.println(arrList);
    }
}
