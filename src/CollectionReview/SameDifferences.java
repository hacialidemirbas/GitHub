package CollectionReview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SameDifferences {

        public static void main(String[] args) {
            int arr[] = {2,4,6,8,6,3,2};
            findSameDifferences(arr);
        }
        public static void findSameDifferences(int arr[]){
            List<Integer> diffs = new ArrayList<>();
            for (int i = 0; i < arr.length-1 ; i++) {
                System.out.print(arr[i]+" will be substracted with : ");
                for (int j = i+1 ; j < arr.length ; j++) {
                    System.out.print(arr[j]+"\t");
                    diffs.add(Math.abs(arr[i]-arr[j]));
                }
                System.out.println();
            }
            System.out.println(diffs);
            HashMap<Integer,Integer> hm = new HashMap<>();
            for(int nums : diffs){
                if(hm.containsKey(nums)){
                    hm.put(nums,hm.get(nums)+1);
                }
                else{
                    hm.put(nums,1);
                }
            }
            for(int key : hm.keySet()){
                if(hm.get(key)>1){
                    System.out.println("Difference : "+key+"\t Occurance : "+hm.get(key));
                }
            }
        }
    }


