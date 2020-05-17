package JavaFinalReview;

public class Polymorphism {
    public static void main(String[] args) {
        Appliance freezer= new Refrigerator();
        Appliance appliance= new Appliance();
        Refrigerator refrigerator=(Refrigerator) appliance;


    }
}
class Appliance{
    void switchOn(){
        System.out.println("switch on");
    }
}
class Refrigerator extends Appliance{
    void cooling(){
        System.out.println("cooling");
    }

}
