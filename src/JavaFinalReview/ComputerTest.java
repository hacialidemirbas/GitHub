package JavaFinalReview;

public class ComputerTest {
    public static void main(String[] args) {
        Laptop a = new Laptop();
        a.charge();
        Computer b = new Laptop();
        b.turnOn();
        b.turnOff();

        System.out.println(a instanceof Computer);
        System.out.println(b instanceof Computer);
        System.out.println(a instanceof Laptop);
        System.out.println(b instanceof Laptop);
    }
}
class Laptop implements Computer {
    public void charge(){
        System.out.println("Charging");
    }

    @Override
    public void turnOff() {
        System.out.println("Off");
    }

    @Override
    public void turnOn() {
        System.out.println("on");
    }
}
interface Computer {
    void turnOff();
    void turnOn();
}
