package String_Processing;

public class Fourth {
    public static void main(String[] args) {
        StringBuilder str= new StringBuilder("Nilfilsa 3710");
        StringBuilder str1= new StringBuilder("3710");
        System.out.println(isAllDigit(str));
        System.out.println(isAllDigit(str1));
    }
    public static boolean isAllDigit(StringBuilder str){
        boolean result=true;
        for (int i = 0; i <str.length() ; i++) {
            if(!(str.codePointAt(i)>=48&&str.codePointAt(i)<=57)){
                result =false;
            }

        }
        return result;
    }
}
