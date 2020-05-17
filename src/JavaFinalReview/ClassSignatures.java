package JavaFinalReview;

public abstract class ClassSignatures {
    public void method(){
        System.out.println("Java");
    }
    public abstract void method2();

}
class Signature extends ClassSignatures{
    public void method2(){
        System.out.println("This is a method");

    }

}