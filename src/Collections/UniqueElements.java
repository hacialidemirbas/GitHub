package Collections;

import java.util.*;

public class UniqueElements {
    public static void main(String[] args) {
int x =1 + 2 * 3 + 7 * 2 % 5;
int y=32%5;
        System.out.println(y);
        System.out.println(1 + 2 * 3 + 7 * 2 % 5);
        int[] a={1, 3, 4, 4, 4};
        int[] b= {2, 5, 7};
        int[] c={9,8,7,6};
        int[] d= {4,4,3,2};
        int[] e={3,3,3,3};
        int[] f= {2};

        System.out.println(isUnique(a,b));
        System.out.println(isUnique(c,d));
        System.out.println(isUnique(e,f));
        System.out.println(getFirstValue(a));
          }
    public static int getFirstValue(int[] arr) {
        return arr[0];
    }
    public static boolean isUnique(int[] arr1, int[] arr2){
        boolean result=false;
        Set<Integer>set1=new HashSet<>();
        Set<Integer>set2=new HashSet<>();
        for(int i=0; i<arr1.length;i++){
            set1.add(arr1[i]);
        }
        for(int i=0; i<arr2.length;i++){
            set2.add(arr2[i]);
        }
        if(set1.size()==set2.size()){
             result= true;
        }
        return result;
    }
}
