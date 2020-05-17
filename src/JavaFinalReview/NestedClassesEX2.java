package JavaFinalReview;

public class NestedClassesEX2 {
    public static void main(String[] args) {
       House1 ev= new House1("Internet connected","electric connected");
       House1.Room oda= ev.new Room("Windows open");
        System.out.println(oda instanceof House1.Room);
        ev.electric();
        ev.internet();
        oda.windows();

    }
}
class House1 {
    String internet;
    String electric;

    public House1(String internet, String electric) {
        this.internet = internet;
        this.electric = electric;
    }

    void electric(){
        System.out.println("Electric connected");
    }
    void internet(){
        System.out.println("internet connected");
    }

    class Room{
        String window;

        public Room(String window) {
            this.window = window;
        }

        void windows(){
            System.out.println("Window is open");
        }

    }
}
