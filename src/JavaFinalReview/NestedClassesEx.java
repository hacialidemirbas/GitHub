package JavaFinalReview;

public class NestedClassesEx {
    public static void main(String[] args) {
        Outer outer= new Outer();
        Outer.Inner inner= outer.new Inner();

    }

}
class Outer{
    void outer(){
        System.out.println("This is outer");
    }
    class Inner{
        void inner(){
            System.out.println("This is inner");
        }

    }
}