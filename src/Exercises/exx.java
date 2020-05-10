package Exercises;

public class exx extends ex {
    int i=20;

    public static void main(String[] args) {
        ex a= new exx();
        ex b= new ex();
        exx c= new exx();
        System.out.println(a.i);
        System.out.println(b.i);
        System.out.println(c.i);
    }
}
