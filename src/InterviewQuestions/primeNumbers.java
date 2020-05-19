package InterviewQuestions;
public class primeNumbers {
    //private Date rob = new Date();
    private static int yes=1;
    final int a;
    public static void main(String[] args) {
        int yes=5;
        System.out.println(yes);
        int b=5;

        /*primeNumbers pm=new primeNumbers(5);
        System.out.println(pm.yes);
        printPrimeNumbers(100);*/
    }
    public static void printPrimeNumbers(int limit){
        int count;
        for (int i = 1; i <= limit; i++) {
            count = 0;
            for (int j = i; j >=1 ; j--) {
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.print(i+" ");
            }
        }
    }
    public primeNumbers(int x){
        x=5;
        a=x;
    }


}
