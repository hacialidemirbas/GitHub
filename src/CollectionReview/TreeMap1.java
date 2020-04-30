package CollectionReview;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class TreeMap1 {
    public static void main(String args[]){

        LinkedHashMap<String,String> phoneBook=new LinkedHashMap<>();

        phoneBook.put("Ali","555666777");
        phoneBook.put("Veli","333444555");
        phoneBook.put("Hasan","444555111");
        phoneBook.put("Huseyin","111555444");
        System.out.println(phoneBook);
        Iterator<String> iter = phoneBook.keySet().iterator();
        String key;
        while(iter.hasNext()){
            key = iter.next();
            System.out.println(key+"\t=\t"+phoneBook.get(key));
        }


        for(Map.Entry m:phoneBook.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
