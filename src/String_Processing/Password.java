package String_Processing;

import java.util.ArrayList;
import java.util.List;

public class Password {
    public static void main(String[] args) {
        System.out.println("Number of Lower Case Letters : "+countLower("Abc$3s4"));
        System.out.println("Number of Digits : "+countDigits("Abc$3s4"));
        System.out.println("Number of Upper Case Letters : "+countUpper("Abc$3s4"));
        System.out.println("Number of Special Characters  : "+countSpecial("Abc$3s4"));
        System.out.println(checkMyPassword("Abc$ 3s4"));
            }
            public static int countDigits(String password){
        String numbers="0123456789";
        int count=0;
                for (int i = 0; i < password.length(); i++) {
                   if(numbers.contains(password.substring(i,i+1))) {
                       count ++;
                   }
                }
                return count;
            }
            public static int countLower(String password){
                String lowerCase="abcdefghijklmnoprstuvwxyz";
                int count=0;
                for (int i = 0; i < password.length(); i++) {
                    if(lowerCase.contains(password.substring(i,i+1))) {
                        count ++;
                    }}
                return count;
            }
    public static int countUpper(String password){
        String upperCase="ABCDEFGHIJKLMNOPRSTUVWXYZ";
        int count=0;
        for (int i = 0; i < password.length(); i++) {
            if(upperCase.contains(password.substring(i,i+1))) {
                count ++;
            }}
        return count;
    }
    public static int countSpecial(String password){
        String specialCharacters="!@#$%^&*()_+";
        int count=0;
        for (int i = 0; i < password.length(); i++) {
            if(specialCharacters.contains(password.substring(i,i+1))) {
                count ++;
            }}
        return count;
    }
    public static int checkMyPassword(String password){
        int digits=countDigits(password);
        int lowers=countLower(password);
        int uppers=countUpper(password);
        int specials=countSpecial(password);
        if(password.length()<6){
            return 6-password.length();
        }
        else { List<Integer> counts= new ArrayList<>();
        counts.add(digits);
            counts.add(lowers);
            counts.add(uppers);
            counts.add(specials);
            int zeroCount=0;
            for(int count:counts){
                if(count==0){
                    zeroCount++;
                }
            }

            return zeroCount;

        }
    }
}
