package CollectionReview;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class MaxAdjacent {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,2,4};
        findMaxAdjacent(arr);
    }
    public static void findMaxAdjacent(int arr[]){
        List<Integer> multiplies = new ArrayList<>();
        for (int i = 0; i < arr.length-1 ; i++) {
            multiplies.add(arr[i]*arr[i+1]);
        }
        System.out.println(multiplies);
        int max=Collections.max(multiplies);
        int index = multiplies.indexOf(max);
        System.out.println(index);
        System.out.println("index 1:\t"+index+"\t value:\t"+arr[index]);
        System.out.println("index 2:\t"+(index+1)+"\tvalue:\t"+arr[index+1]);
        System.out.println("Max multiplication:\t"+(arr[index]*arr[index+1]));
    }
}
