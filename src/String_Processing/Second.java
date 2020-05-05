package String_Processing;

public class Second {
    public static void main(String[] args) {
        StringBuilder myBuilder= new StringBuilder("Java is Super fun");
        System.out.println(myBuilder);
StringBuilder reverse=myBuilder.reverse();
        System.out.println(reverse);
        System.out.println(reverse.compareTo(myBuilder));
        if(reverse.equals(myBuilder)){//pointing the same object
            System.out.println("They are same");
        }
        else{
            System.out.println("They are not same");
        }
        StringBuilder reverse1= new StringBuilder(reverse.reverse().toString());
        System.out.println(reverse1);
        if(myBuilder.equals(reverse1)){//pointing new object
            System.out.println("They are same");
        }
        else{
            System.out.println("They are NOT same");
        }
        reverse1.append(" This part is added");
        System.out.println(reverse1);
        System.out.println(reverse1.capacity());
        reverse1.append(" This is another addition");
        System.out.println(reverse1);
        System.out.println(reverse1.capacity());
    }
}
