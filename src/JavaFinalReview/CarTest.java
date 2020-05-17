package JavaFinalReview;

public class CarTest {
    public static void main(String[] args) {
        Vehicle car= new Vehicle("yellow");
        Vehicle car1= new Car("pink");
        Car car2= new Car("black");
        Car.honk();
        Vehicle.honk();
        System.out.println(car.color);
        System.out.println(car1.color);
        System.out.println(car2.color);

    }
}
