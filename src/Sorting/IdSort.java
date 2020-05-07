package Sorting;
import java.util.Comparator;

public class IdSort implements Comparator<Students> {
    public int compare(Students st1, Students st2){
        if(st1.id==st2.id){
            return 0;
        }
        else if(st1.id>st2.id){
            return 1;
        }
        else{
            return -1;
        }
    }}