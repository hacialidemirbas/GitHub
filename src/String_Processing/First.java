package String_Processing;

public class First {
    public static void main(String[] args) {
        StringBuilder mybuilder=new StringBuilder(50);
        System.out.println(mybuilder.capacity());
        StringBuilder myBuilder1= new StringBuilder();
        myBuilder1.append(" One");
        myBuilder1.append(" Two");
        myBuilder1.append(" Three");
        System.out.println(myBuilder1);
        myBuilder1.insert(5," Super");
        System.out.println(myBuilder1);
        myBuilder1.replace(7,12," insert");
        System.out.println(myBuilder1);
        myBuilder1.delete(0,5);
        System.out.println(myBuilder1);
        System.out.println(myBuilder1.capacity());
    }
}
