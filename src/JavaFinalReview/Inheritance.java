package JavaFinalReview;

public class Inheritance {

}
class Animal{
int numberOfLegs;
String name;
Animal(String name, int numberOfLegs){
    this.name=name;
    this.numberOfLegs=numberOfLegs;

}
}
class Cat extends Animal{

    Cat(String name, int numberOfLegs) {
        super(name, numberOfLegs);
    }
}