package Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class HackerRankArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> temp = new ArrayList<>();
        int number=1;
        for(int i=0 ; i<5 ; i++){
            arr.add(new ArrayList<>());
            number=1;
            while(number!=0){
                System.out.print("Enter number");
                number=scan.nextInt();
                if(number!=0){
                    temp.add(number);
                    //System.out.println(temp);
                }
            }
            arr.get(i).addAll(temp);
            temp.clear();
            //System.out.println(arr);
        }

        for(ArrayList<Integer> row : arr){
            for (int num : row){
                System.out.print(num+"\t");
            }
            System.out.println();
        }
        System.out.println("Please enter your query");

    }

}