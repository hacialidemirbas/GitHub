package CollectionReview;
import java.util.*;
public class RandomArrayList {
    public static void main(String[] args) {
    ArrayList<ArrayList<Integer>> numbers = new ArrayList<>();
    for (int i = 0 ; i < 10 ; i++) { //rows
        numbers.add(new ArrayList<>());
        for (int j = 0 ; j < 10 ; j++) { //elements in a row
            numbers.get(i).add((int)(Math.random()*100));
        }
    }
    Iterator<ArrayList<Integer>> iter = numbers.iterator();
    while (iter.hasNext()){
        System.out.println(iter.next());
    }
    System.out.println("----------------------------");
    multiplyWithConstant(numbers,10);
    int[]window = {2,3};
    System.out.println("----------------------------");
    multiplyWithArray(numbers,window);
}
    public static void multiplyWithConstant(ArrayList<ArrayList<Integer>> arr,int constant){
        int result;
        for (int i = 0; i < arr.size() ; i++) {
            for (int j = 0; j < arr.get(i).size() ; j++) {
                result=arr.get(i).get(j)* constant;
                arr.get(i).set(j,result);
            }
        }
        Iterator<ArrayList<Integer>> iterator = arr.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    public static  void multiplyWithArray(ArrayList<ArrayList<Integer>> arr, int[] window){
        int increment = window.length;
        int result;
        for (int i = 0; i < arr.size() ; i++) {
            for (int j = 0; j < arr.get(i).size(); j+=increment) {
                //System.out.println("j="+j);
                result=arr.get(i).get(j)*window[0];
                arr.get(i).set(j,result);
                result=arr.get(i).get(j+1)*window[1];
                arr.get(i).set(j+1,result);
            }
        }
        Iterator<ArrayList<Integer>> iterator = arr.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
