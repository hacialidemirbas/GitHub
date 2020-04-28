package CollectionReview;

import java.util.HashMap;
import java.util.Iterator;

public class Repeating3DigitNumber {
        public static void main(String[] args) {
            String number="123412345123456";
            HashMap<String,Integer> numbers = new HashMap<>();
            String threeNum;

            for (int i = 0; i < number.length()-2 ; i++) {
                System.out.println(number.substring(i,i+3));
                threeNum=number.substring(i,i+3);
                if(numbers.containsKey(threeNum)){
                    numbers.put(threeNum,numbers.get(threeNum)+1);
                }
                else {
                    numbers.put(threeNum,1);
                }
            }
            System.out.println(numbers);
            Iterator<String> iterator = numbers.keySet().iterator();
            String key;
            while(iterator.hasNext()){
                key = iterator.next();
                if(numbers.get(key)>1){
                    System.out.println(key+" = "+numbers.get(key));
                }
            }

        }
    }




