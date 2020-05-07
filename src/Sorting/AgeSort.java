package Sorting;
import java.util.Comparator;

public class AgeSort implements Comparator<Students> {
    public int compare(Students st1, Students st2){
        if(st1.age==st2.age){
            return 0;
        }
        else if(st1.age>st2.age){
            return 1;
        }
        else{
            return -1;
        }
    }
}
