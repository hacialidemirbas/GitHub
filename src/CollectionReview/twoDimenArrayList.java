package CollectionReview;

import java.util.ArrayList;
import java.util.Iterator;

public class twoDimenArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> listOfLists = new ArrayList<ArrayList<Integer>>();
        int number=1;
        for (int i=0;i<5;i++){
            listOfLists.add(new ArrayList<>());
            for(int j=0;j<3;j++){
                listOfLists.get(i).add(number);
                number++;
            }
        }
        System.out.println(listOfLists);
        for(ArrayList<Integer> sublist : listOfLists){
            for (int numb : sublist){
                System.out.println(numb);
            }
        }
        Iterator<ArrayList<Integer>> iter = listOfLists.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }


    }
}
