package Exercises;

public class mainClass {
    public static void main(String[] args) {
        C.method();
    }
}
class A{
    private int m=5;
    static void method()
    {
        System.out.println(1);
    }
}
class B extends A{static void method(){
    System.out.println(2);
    //System.out.println(m);

}}
class C extends B{

    static void method(){
    System.out.println(3);
}}
