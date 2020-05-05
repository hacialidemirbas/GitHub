package Exercises;

public class ArrayList2 {
    public static void main(String[] args) {
        int [] arr= new int [5];
        byte b=4;
        char c='c';
        long longVar=10;
        arr[0]=b;
        arr[1]=c;
        arr[3]=(int)longVar;
        for (int a:arr) {
            System.out.print(a+"  ,   ");

        }
        System.out.println(arr[2]);

    }
}
