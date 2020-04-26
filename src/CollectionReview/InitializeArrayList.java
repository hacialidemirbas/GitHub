package CollectionReview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InitializeArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> obj= new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        List<Integer> obj1= new ArrayList<>(List.of(1,2,3,4,5,6,7,8));
        System.out.println(obj1);
    }
}
