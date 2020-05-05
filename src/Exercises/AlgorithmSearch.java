package Exercises;

public class AlgorithmSearch {
   /* private int[] array;
    public AlgorithmSearch(int[] array){
        this.array=array;
    }*/
    public int linearsearch(int array[],int item){
        for (int i = 0; i <array.length ; i++) {
            if(array[i]==item){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr={3,5,1,7,2,8,9,1};
        AlgorithmSearch al=new AlgorithmSearch();
        System.out.println(al.linearsearch(arr,1));

    }


}
