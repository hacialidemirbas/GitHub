package JavaFinalReview;

import java.util.HashSet;

class edabitVowels {
    public static void main(String[] args) {
        String[] arr={"toe","ocelot","maniac"};
        printSameVowels(arr);
    }
    public static boolean hasSameVowels(String str1, String str2){
        String vowels="aeiou";
        HashSet<String>hs1= new HashSet<>();
        HashSet<String>hs2= new HashSet<>();
        for (int i = 0; i <str1.length() ; i++){
            if(vowels.contains(str1.substring(i,i+1))){
                hs1.add(str1.substring(i,i+1));
            }
        }
        for (int i = 0; i <str2.length() ; i++){
            if(vowels.contains(str2.substring(i,i+1))){
                hs2.add(str2.substring(i,i+1));
            }
    }
    if(hs1.equals(hs2)){
    return true;}
    else{
        return false;
    }
    }

    public static void printSameVowels(String []arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(hasSameVowels(arr[i],arr[j])){
                    System.out.println(arr[i]+"\t"+arr[j]);
                }

            }

        }

    }
}
