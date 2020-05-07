package Sorting;
import java.util.Comparator;

public class NameSort implements Comparator<Students> {
    public int compare(Students st1, Students st2){
        return st1.name.compareTo(st2.name);

    }
}
