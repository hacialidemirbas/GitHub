package CollectionReview;

import java.util.*;

public class shiftLeftNumberElements {
    public static void main(String[] args) {
        ArrayList<Integer> myArr= new ArrayList<>(Arrays.asList(1,2,3,4,5));
        shiftLeftNumber(myArr,3);
    }
    public static void shiftLeftNumber(ArrayList<Integer> arr, int n){
        for(int i=0;i<n;i++){
            arr.remove(0);
        }
        System.out.println(arr);
    }
}
