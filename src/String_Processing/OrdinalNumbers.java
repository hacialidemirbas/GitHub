package String_Processing;

import java.util.HashMap;

public class OrdinalNumbers {
    public static void main(String[] args) {
        System.out.println(returnOrdinal(884845684));

    }
    public static String returnOrdinal(int number){
        HashMap<Character,String>ordinals=new HashMap<>();
        ordinals.put('1',"ST");
        ordinals.put('2',"ND");
        ordinals.put('3',"RD");
        ordinals.put('4',"TH");
        String ordNumber=""+number;
        char last= ordNumber.charAt(ordNumber.length()-1);
        for(char key:ordinals.keySet()){
            if(key==last){
                ordNumber+="-"+ordinals.get(key);
            }
        }
        return ordNumber;
    }
}
