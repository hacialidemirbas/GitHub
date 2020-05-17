package Exercises;

public class CodeLab {
    public static void main(String [] args){

        int [] x = {1,2,3,4,5,6,7,8,9,10};
        int total = 0;
        for (int i=0; i<x.length;i++) {
            total += x[i];
        }
        System.out.println(total);
    }
}
