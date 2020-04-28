package CollectionReview;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class Anagram {
    public static void main(String[] args) {
        String arr[] = {"cat","cta","car","care"};
        System.out.println(isAnagram(arr[2],arr[3]));
        isAnagramArr(arr);
    }
    public static boolean isAnagram(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        else {
            char arr1[] = str1.toCharArray();
            char arr2[] = str2.toCharArray();
            List<Character> list1 = new ArrayList<>();
            List<Character> list2 = new ArrayList<>();
            for (int i = 0; i < arr1.length; i++) {
                list1.add(arr1[i]);
                list2.add(arr2[i]);
            }
            Collections.sort(list1);
            Collections.sort(list2);
            if (list1.equals(list2)) {
                return true;
            } else {
                return false;
            }
        }
    }
    public static void isAnagramArr(String[] arr){
        for (int i = 0; i < arr.length-1 ; i++) {
            if (isAnagram(arr[i],arr[i+1])){
                System.out.println(arr[i]+" and "+arr[i+1]+" are anagram");
            }
        }
    }


}
