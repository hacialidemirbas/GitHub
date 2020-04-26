package CollectionReview;

import java.util.ArrayList;
import java.util.Arrays;

public class MultiplicationOf2ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrList1= new ArrayList<>(Arrays.asList(1,2,3));
        ArrayList<Integer> arrList2= new ArrayList<>(Arrays.asList(4,5,6));
        ArrayList<Integer> multp= new ArrayList<>();
        for(int i=0;i<arrList1.size();i++) {
            multp.add(arrList1.get(i)*arrList2.get(i));
        }
        System.out.println(multp);
    }

}
