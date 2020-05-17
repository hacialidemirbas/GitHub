package JavaFinalReview;

public class PolyExample {
    public static void main(String[] args) {
        Animal_ a = new Animal_();
        a.sleep();
        a.makeSound();
        Animal_ b = new Cat_();
        b.sleep();
        b.makeSound();
        Animal_ c = new Dog_();
        c.sleep();
        c.makeSound();
        Cat_ d = new Cat_();
        d.eat();
        Dog_ e = new Dog_();
        e.eat();
    }
}
class Animal_ {
    void sleep(){
        System.out.println("zzz");
    }
    void makeSound(){
        System.out.println("sound");
    }
}
class Dog_ extends Animal_{
    void makeSound(){
        System.out.println("Wof");
    }
    void eat(){
        System.out.println("Fish");
    }
}
class Cat_ extends Animal_{
    void makeSound(){
        System.out.println("meow");
    }
    void eat(){
        System.out.println("Bone");
    }
}