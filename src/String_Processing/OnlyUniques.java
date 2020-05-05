package String_Processing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class OnlyUniques {
    public static void main(String[] args) {
        String arr[]={"aaa","abc","def","ghi"};
        System.out.println(Arrays.toString(uniquesOnly(arr)));


    }
    public static boolean isAllUnique(String word){
        HashSet<Character>hset= new HashSet<>();
        for (int i = 0; i < word.length(); i++) {
            hset.add(word.charAt(i));

        }
        if (hset.size()==word.length()){
            return true;
        }
        else{
            return false;
        }
    }
    public static String[] uniquesOnly(String[]arr){
        List<String> list= new ArrayList<>();
        for(String element: arr){
            if(isAllUnique(element)){
                list.add(element);
            }
        }
        arr= list.toArray(arr);
        return arr;
    }
}

