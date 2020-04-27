package CollectionReview;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String,String>hm=new HashMap<>();
        hm.put("Java","Medium");
        hm.put("Sql","expert");
        hm.put("Selenium","master");
        hm.put("Cucumber","novice");
        System.out.println(hm);
        Iterator<String> iterator= hm.keySet().iterator();
        String key;
        while(iterator.hasNext()){
            key=iterator.next();
            System.out.println(key+":\t"+hm.get(key));
        }
    }
}
