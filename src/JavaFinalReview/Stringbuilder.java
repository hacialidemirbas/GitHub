package JavaFinalReview;

public class Stringbuilder {
    public static void main(String[] args) {
        String x="a";
        StringBuilder builder= new StringBuilder("a");
        builder.append('c');
        builder.setCharAt(0,'b');
        System.out.println(builder);
        builder.delete(0,builder.length());
        System.out.println(builder+"empty");
        builder.append("xyz");
        System.out.println(builder);
        builder= new StringBuilder(x);
        System.out.println(builder);
    }
}
