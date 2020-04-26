package Collections;

import java.util.HashMap;

public class EdabitEncryption {
    public static void main(String[] args) {
        String[] words={"apple","banana","karaca"};
        for(String word:words){
            System.out.println(applyKaraca(word));
        }

    }
    public static String applyKaraca(String word){
        //step1 reverse the string
        StringBuilder result=new StringBuilder(word);
        result.toString();
        result.reverse();

        //step2 replacewovels;
        HashMap<Character, Character> hm=new HashMap<>();
        hm.put('a','0');
        hm.put('e','1');
        hm.put('o','2');
        hm.put('u','3');
        char letter;
        String realResult="";
        for(int i=0;i<result.length();i++){
            letter=result.charAt(i);
            if(hm.containsKey(letter)){
                realResult+=hm.get(letter);
            }
            else{
                realResult+=result.charAt(i);
            }
        }
        //step3 add "aca"
        realResult+="aca";
        return realResult;

    }
}
