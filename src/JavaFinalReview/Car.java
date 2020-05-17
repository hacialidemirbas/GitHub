package JavaFinalReview;

public class Car extends Vehicle {
    public Car(String color) {
        super(color);
        color="Blue";
    }

    public static void honk() {
        System.out.println("Car beeps");

    }
}
