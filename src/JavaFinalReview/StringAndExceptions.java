package JavaFinalReview;

public class StringAndExceptions {
    public static void main(String[] args)  {
        String a=null;
        try {
            System.out.println(a.charAt(10));
        }
        catch(NullPointerException e){
            System.out.println("It is null");
        }
        StringBuffer buffer= new StringBuffer("Java");
        buffer.append(new B( 1,2));
        System.out.println(buffer.charAt(5));
        System.out.println(buffer.substring(4).length());
    }

}
class B{
    int x;
    int y;

    public B(int x, int y) {
        this.x=x;
        this.y=y;
    }
}