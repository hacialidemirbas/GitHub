package String_Processing;

public class EndSame {
    public static void main(String[] args) {
        String str1="Java Rocks";
        String str2="ks";
        System.out.println(isEndSame(str1, str2));

    }
    public static boolean isEndSame(String str, String end){
        int startIndex=str.length()-end.length();
        int endIndex=str.length();
        if(str.substring(startIndex,endIndex).equals(end)){
            return true;
        }
        else{
            return false;
        }
    }
}
