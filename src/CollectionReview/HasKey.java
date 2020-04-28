package CollectionReview;

import java.util.HashMap;
import java.util.Iterator;

public class HasKey {

    public static void main(String[] args) {
        HashMap<String,String > hashMap = new HashMap<>();
        hashMap.put("A","a");
        hashMap.put("B","b");
        hashMap.put("C","c");
        System.out.println(isKeyHas(hashMap,"D"));
    }
    public  static boolean isKeyHas(HashMap<String,String> hm, String key){
        boolean result=false;
        Iterator<String> iterator = hm.keySet().iterator();
        while(iterator.hasNext()){
            if (key.equals(iterator.next())){
                result = true;

            }
        }
        return result;
    }
}
