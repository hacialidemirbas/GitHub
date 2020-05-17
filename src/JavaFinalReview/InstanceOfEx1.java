package JavaFinalReview;

import java.util.ArrayList;
import java.util.List;

public class InstanceOfEx1 {
    public static void main(String[] args) {
        List<Pen> list= new ArrayList<>();
        if(list instanceof List){
            System.out.println("Yes");
        }
        list.add(new Pen());
        list.add(new Crayola());
        list.add(new Pen());

        list.forEach(element ->{
            if(element instanceof Crayola) {
                element.write();
            }
        });
    }
}
class Pen{

    void write() {
        System.out.println("Writing");
    }
}
class Crayola extends Pen{

    void draw() {
        System.out.println("Drawing");
    }
}
