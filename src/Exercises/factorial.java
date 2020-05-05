package Exercises;

public class factorial {
    public static void main(String[] args) {
factorial fctrl= new factorial();
        System.out.println(fctrl.factorial(5));
        System.out.println(factorialVMethod(5));
    }
    public int factorial(int n){
        if(n==1) return n;
        return n*factorial(n-1);
    }
    public static int factorialVMethod(int n){
        if(n==1) return n;
        int result=n*factorialVMethod(n-1);

        return result;
    }
}
