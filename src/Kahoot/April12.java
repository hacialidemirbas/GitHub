package Kahoot;

import java.util.ArrayList;
import java.util.Arrays;

public class April12 {
    public static void main(String[] args) {
        ArrayList<Character> x= new ArrayList<>(Arrays.asList('J','a','v','a'));
       /* for(int i=0;i<x.size();i++){
            if(!(x.get(i)>65 && x.get(i)<92)){
                x.remove(i);
            }
            System.out.println(x);
        }
        for(int i=0;i<x.size();i++){
            if(x.get(i)>65&&x.get(i)<92){
                x.remove(i);
            }
            System.out.println(x);
        }
        ArrayList<Integer>List1= new ArrayList<>();
        ArrayList<String>List2= new ArrayList<>(20);
        List1.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        ArrayList<Integer>List3= new ArrayList<>(List1);
        System.out.println(List2);
        System.out.println(List1.get(List1.set(0,10)));
        byte a[]={1,2,3};
        int []b={1,2,3};
        int[]c={1};
        char[]d={'a'};
        String []e={"abcd"};*/
        System.out.println(doSomething());
        a("Hello");

         }
    static void a(String a){
        String b=a.toLowerCase();
        for(byte i=0;i<a.length();i++){
            char x= b.charAt(i);
            x++;
            System.out.print(x);
        }
    }
    public static int doSomething(){
        return 0;
         }
}
