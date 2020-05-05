package String_Processing;

public class Third {
    public static void main(String[] args) {
        StringBuilder myBuilder= new StringBuilder("Nilfilsa Nilu Filu Sami");
        System.out.println(myBuilder);
        myBuilder.setCharAt(0,'A');
        System.out.println(myBuilder);
        System.out.println(myBuilder.codePointCount(0,13));
        System.out.println(myBuilder.codePointAt(0));//unicode
        StringBuilder upp= new StringBuilder("nilfilsa");
        int letter;
        for (int i = 0; i <upp.length() ; i++) {
            letter= upp.codePointAt(i);
            letter -=32;
            upp.setCharAt(i,(char)letter);
                    }
        System.out.println(upp);
    }
}
