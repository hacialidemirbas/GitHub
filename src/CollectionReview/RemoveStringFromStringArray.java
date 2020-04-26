package CollectionReview;

import java.util.*;
import java.util.List;

public class RemoveStringFromStringArray {
    public static void main(String[] args) {
        ArrayList<String> arrayLst= new ArrayList<>(List.of("Java","is","fun","Java","yes","Java","Java","Java"));
        String temp="";
        for(int i=0;i<arrayLst.size();i++){
            temp=arrayLst.get(i);
            arrayLst.remove(arrayLst.get(i));
          if(!arrayLst.contains(temp)){
                arrayLst.add(temp);
            }

        }
        System.out.println(arrayLst);
        List<String> list = new ArrayList<>(Arrays.asList("Java","is","fun","Java","yes","Java","Java","Java"));
        int counter=0;
        int index=0;
        for(int i = 0 ; i < list.size() ; i++ ){
            System.out.print("Compare "+"\""+ list.get(i)+"\" with : ");
            for (int j = i+1 ; j < list.size() ; j++) {
                System.out.print(list.get(j)+"\t");
                if(list.get(i).equals(list.get(j))){
                    counter++;
                    if(counter==2) {
                        index = j;
                    }
                }
            }
            System.out.println();
        }
        System.out.println(index);
        list.remove(index);
        System.out.println(list);

    }
}
