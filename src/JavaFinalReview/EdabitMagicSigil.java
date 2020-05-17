package JavaFinalReview;

import java.util.HashSet;

public class EdabitMagicSigil {
    public static void main(String[] args) {
        String sentence="I HAVE WONDERFUL FRIENDS WHO LOVE ME";
        String sentence1 = "I have a job I enjoy and it pays well";
        sentence = removeDuplicates(sentence);
        sentence = removeSpaces(sentence);
        sentence = removeVowels(sentence);
        System.out.println(sentence.toUpperCase());
        sentence1 = removeDuplicates(sentence1);
        sentence1 = removeSpaces(sentence1);
        sentence1 = removeVowels(sentence1);
        System.out.println(sentence1.toUpperCase());

    }

    public static boolean isVowel(char ch){
        ch=Character.toLowerCase(ch);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            return true;
        }
        else{
            return false;
        }
    }
    public static String removeDuplicates(String string){
        HashSet<Character> hashSet=new HashSet<>();
        for (int i = 0; i <string.length() ; i++) {
            hashSet.add(string.charAt(i));
        }
        String result = "";
        for (char ch : hashSet){
            result += ch;
        }
        return result;
    }
    public static String removeSpaces(String string){
        String result="";
        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i)!=' '){
                result+=string.charAt(i);
            }
                   }
        return result;
    }
    public static String removeVowels(String word){
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            if(!isVowel(word.charAt(i))){
                result += word.charAt(i);
            }
        }
        return  result;
    }

}
