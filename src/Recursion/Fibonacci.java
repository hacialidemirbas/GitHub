package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(FibonacciNum(i));
        }

    }
    public static long FibonacciNum(int num){
        if(num<=1){
            return 1;
        }
        else{
            return FibonacciNum(num-2)+FibonacciNum(num-1);
        }

    }
}
