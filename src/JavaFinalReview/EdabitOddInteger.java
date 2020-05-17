package JavaFinalReview;

import java.util.HashMap;

class EdabitOddInteger {
    public static void main(String[] args) {
        int numbers[] = {1,2,3,2,1,1,2,2,4,4,5,32,1,1,2,4};
        findOddOccurances(numbers);
        System.out.println("-------------------------");
        findWithHashMap(numbers);
    }
    public static void findOddOccurances(int arr[]){
        int count;
        for (int i = 0; i < arr.length; i++) {
            count=0;
            for (int j = 0; j < arr.length; j++) {
                if(i!=j && arr[i]==arr[j]){
                    count++;
                }
            }
            if(count%2==1){
                System.out.println(arr[i]+"\t=\t"+count);
            }
        }
    }
    public static void findWithHashMap(int arr[]){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else {
                hm.put(arr[i],1);
            }
        }
        for(int key:hm.keySet()){
            if(hm.get(key)%2==1){
                System.out.println(key+"\t=\t"+hm.get(key));
            }
        }
    }
}