package JavaFinalReview;

public class StringExample {
    public static void main(String[] args) {
        String a="abc";
        String b="abc";
        System.out.println("a="+a.hashCode()+"\tb="+b.hashCode());
        System.out.println(a==b);
        String c= new String("abc");
        String d= new String("abc");
        System.out.println(c==d);
        System.out.println(c.equals(d));
        System.out.println(a.equals(d));
        System.out.println(a.compareTo(d));//char values
        System.out.println('0'+'0');//asci value
        stringValue("00");
        String st="Java";
        st+=" is fun";
        System.out.println(st);
    }
    public static void stringValue(String st){
        int stValue=0;
        for (int i = 0; i <st.length() ; i++) {

            stValue+=st.charAt(i);

        }
        System.out.println(stValue);
    }
}
