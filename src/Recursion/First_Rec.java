package Recursion;

public class First_Rec {
    public static void main(String[] args) {
callMe(5);
    }
    public static void callMe(int count){
        System.out.println(count);
        if(count>0){
            callMe(--count);
        }
    }
}
