package String;

public class String5 {
    public static void main(String[] args) {
        char[] ch={'j','a','v','a','t','p','o','i','n','t'};
        String s=new String(ch);
        System.out.println(ch);
        System.out.println(s);
        s.replace('t','T');
        System.out.println(s.replace('t','T'));
        System.out.println(s.toUpperCase());
        String s2= new String(s.toUpperCase());
        char[] ch1=s2.toCharArray();
        System.out.println(s.toLowerCase());
       System.out.println(ch1);

    }
}
