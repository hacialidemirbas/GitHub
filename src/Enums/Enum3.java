package Enums;

public class Enum3 {
    enum Days {
        MONDAY, THUESDAY, WEDNESDAY, THURSDAY, FRIDAY,SATURDAY,SUNDAY
    }
    public static void main(String[] args) {
        for(Days days: Days.values()){
            System.out.println(days);
        }
    }
}
