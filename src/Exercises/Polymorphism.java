package Exercises;

public class Polymorphism {
    public static void main(String[] args) {
        animal animal=new animal();
        animal dog= new animal();
        animal puppy= new animal();
        dog dogdog= new dog();
        dog dogpuppy= new puppy();
        puppy puppypuppy= new puppy();

        /*animal.move();
        dog.move();
        puppy.move();*/
        /*dogdog.move();*/
       /* dogpuppy.move();*/
        puppypuppy.move();
            }
}
class animal{
    public void move (){
        System.out.println("Animals can move");
    }
}
class dog extends animal{
    public void move(){
        super.move();
        System.out.println("Dogs can walk and run");
    }
}
class puppy extends dog{
    public void move(){
        super.move();
        System.out.println("Puppies can walk only");
    }
}