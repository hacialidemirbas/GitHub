package InterviewQuestions;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar",true));
        System.out.println(isPalindrome("dad"));
        System.out.println(123454321);
    }
    public static boolean isPalindrome(String str){
        for(int i=0,j=str.length()-1;i<j;i++,j--){
            System.out.println("i = "+"\t"+"j = "+j);
            if(str.charAt(i)!=str.charAt(j)) {
                return false;
                            }
        }
        return true;
    }
    public static boolean isPalindrome(String str,boolean sb){
        StringBuilder original = new StringBuilder(str);
        StringBuilder reversed = original.reverse();
        if (original.equals(reversed)){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean isNumberPalindrome(int number){
        String num = "" + number;
        return isPalindrome(num);
    }


}
