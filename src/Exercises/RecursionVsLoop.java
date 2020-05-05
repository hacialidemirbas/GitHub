package Exercises;

public class RecursionVsLoop {
    public static void main(String[] args) {
        RecursionVsLoop itr= new RecursionVsLoop();
        System.out.println(itr.iterationSum(5));
        System.out.println(itr.recursionSum(5));


    }
    public int iterationSum(int N){
        int result=0;
        for (int i = 1; i <=N ; i++) {
            result=result+i;

        }
        return result;
    }
    public int recursionSum(int N){
        if(N==1) return 1;
        return N+recursionSum(N-1);
    }
}
