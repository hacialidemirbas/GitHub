package CollectionReview;
import java.util.Arrays;
public class IsAnagram {
    public static void main(String[] args) {
        String[] str = {"Tar", "bike", "Rat", "Arc", "rain", "Car", "Elbow", "apple", "Below", "State", "cat", "Taste", "Cider", "dog", "Cried"};

        for (int j=0;j<str.length;j++ ) {
            String temp="";
            for (int i = 0; i <str.length; i++) {
                temp=str[j];
            if(str[i].length() == temp.length()){
                char c1[] = temp.toCharArray();
                char c2[] = str[j].toCharArray();

                Arrays.sort(c1);
                Arrays.sort(c2);
                if(Arrays.equals(c1, c2)){
                    System.out.println("String  "+str[i]+"   and String  "+temp+"  are Anagram");
                }
                /*else{
                    System.out.println("String  "+str[i]+"   and String  "+str[j]+"  ARE NOT Anagram");
                //checkAnagram(str[i], str[j]);*/
           /* }*/

            }
            /*else{
                System.out.println("\nStrings are not Anagram");
        }*/

         }}
    /*static void checkAnagram(String s1, String s2){
        char c1[] = s1.toCharArray();
        char c2[] = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        if(Arrays.equals(c1, c2)){
            System.out.println("String  "+c1+"and String  "+c2+"  are Anagram");
        }
        else{
            System.out.println("String  "+c1+"and String  "+c2+"  ARE NOT Anagram");
        }
    }*/
}}
