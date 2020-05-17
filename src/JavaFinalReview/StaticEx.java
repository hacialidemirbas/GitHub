package JavaFinalReview;

public class StaticEx {
    static int a=10;

    public static void main(String[] args) {
        Static.method();
        method1();
        method2();
    }
    static void method1(){
        System.out.println("This is method1");
    }
    static void method2(){
        System.out.println("This is method2"+a);
    }
}
class Static{
    static void method(){
        System.out.println(StaticEx.a);
    }
}