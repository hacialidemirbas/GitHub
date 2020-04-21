package Collections;

import java.util.HashSet;

public class CollectionsHashSet {
    public static void main(String[] args) {
        HashSet<String> names= new HashSet<>();
        String[]allnames={"john tom","john marry","john tom","marry anna","marry anna"};
        for(int i=0;i<5;i++) {
           names.add(allnames[i]);
            System.out.println(names.size());
        }


    }

}
