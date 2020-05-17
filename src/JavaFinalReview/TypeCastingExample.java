package JavaFinalReview;

public class TypeCastingExample {
    public static void main(String[] args) {
        /*int x=200;
        byte y= (byte)x;
        System.out.println(y);//-56
        int z= (int)y;
        System.out.println(z);//-56*/
        Dictionary dict= new Dictionary();
        Book dict1= new Dictionary();
       Book book=(Book)dict;
       dict.readBook();
       dict.lookUp();
       dict1.readBook();
        System.out.println(dict.page);
        System.out.println(book.page);

        
    }
}
class Book{
    int page=100;
    void readBook(){

        System.out.println("reading");
    }
}
class Dictionary extends Book{
    int page=500;
    void lookUp(){
        System.out.println("Looking up");
    }

}
