package Recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(calculateFactorial(5));
    }
    public static int calculateFactorial(int num){

        if(num==1)
            return 1;
else
        return (num*calculateFactorial(num-1));
    }
}
