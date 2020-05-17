package JavaFinalReview;

public class InstanceOfExample {
    public static void main(String[] args) {

        GardenTool a= new GardenTool();
        if(a instanceof GardenTool){
            System.out.println("Belongs to GardenTool");
        }
        GardenTool b= new LawnMover();


    }
}
class GardenTool{
    void start(){
        System.out.println("started");
    }
}
class LawnMover extends GardenTool{
    void move(){
        System.out.println("cut");
    }
}