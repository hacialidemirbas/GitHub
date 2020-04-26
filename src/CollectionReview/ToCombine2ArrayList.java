package CollectionReview;

import java.util.ArrayList;
import java.util.Arrays;

public class ToCombine2ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrList1= new ArrayList<>(Arrays.asList(1,2,3));
        ArrayList<Integer> arrList2= new ArrayList<>(Arrays.asList(4,5,6));

       /* arrList1.addAll(arrList2);
        System.out.println(arrList1);*/
        System.out.println("Alternative solution:   "+combineArrayList(arrList1,arrList2));
    }
    public static ArrayList<Integer>combineArrayList(ArrayList<Integer> arrL1,ArrayList<Integer> arrL2){
        ArrayList<Integer> arrList= new ArrayList<>();
        arrList.addAll(arrL1);
        arrList.addAll(arrL2);
        return arrList;
    }

}
