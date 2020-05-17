package JavaFinalReview;
public class Inheritance1 {
}
class Animal1{
    void eat(){System.out.println("eating...");}
    void bark(){System.out.println("animal barking...");}
}
class Dog extends Animal1{
    void bark(){System.out.println("barking...");}
    void eat(){
        System.out.println("dog is eating");
    }}
class TestInheritance{
    public static void main(String args[]){
        Dog d=new Dog();
        d.bark();
        d.eat();
        System.out.println("Animal");
        Animal1 a= new Animal1();
        a.bark();
        a.eat();
        System.out.println("Dog in animal");
        Animal1 ad= new Dog();
        ad.eat();
        ad.bark();
    }}
