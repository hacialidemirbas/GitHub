package OOPReview;

public class Encapsulation {
    private static String name;
    private static int number;
    private static boolean yesNo;

    public Encapsulation(String name,int number, boolean yesNo) {
        this.name=name;
        this.number=number;
        this.yesNo=yesNo;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Encapsulation.name = name;
    }

    public static int getNumber() {
        return number;
    }

    public static void setNumber(int number) {
        Encapsulation.number = number;
    }

    public static boolean isYesNo() {
        return yesNo;
    }

    public static void setYesNo(boolean yesNo) {
        Encapsulation.yesNo = yesNo;
    }
}
