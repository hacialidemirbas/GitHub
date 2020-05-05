package String_Processing;

public class ConsIdent {
    public static void main(String[] args) {
        System.out.println(isConsIdent("loop"));
        System.out.println(isConsIdent("java"));
    }
    public static boolean isConsIdent(String str){
        for (int i = 0; i <str.length()-1 ; i++) {
            if(str.charAt(i)==str.charAt(i+1)){
                return true;
            }
                   }
        return false;
    }
}
