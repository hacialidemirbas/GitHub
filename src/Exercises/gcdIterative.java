package Exercises;

public class gcdIterative {
    public static void main(String[] args) {
        System.out.println(gcdIterative(18,27));
    }


public static int gcdIterative(int i, int j){
    while (j!=0){
        int temp=j;
        j=i%j;
        i=temp;
    }
    return i;
}}
