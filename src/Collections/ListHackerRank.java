package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ListHackerRank {
    public static void main(String[] args) {
        ArrayList<Integer>L=new ArrayList<>(Arrays.asList(12,0,1,78,12));
        doIt(L,5,23);
        System.out.println(L);
        doIt(L,0);
    }
    public static void doIt(ArrayList<Integer>arr, int index){
        arr.remove(index);
        System.out.println(arr);
    }
    public static void doIt(ArrayList<Integer> arr,int index, int element){
        arr.add(index, element);
    }
}
