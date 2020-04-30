package Enums;

public class enum6 {
    enum Month{JANUARY, FEBRUARY, MARCH,APRIL,MAY,JUNE,JULY,AUGUST,SEPTEMBER,OCTOBER,NOVEMBER,DECEMBER}

    public static void main(String[] args) {
        Month myMonth=Month.DECEMBER;
        if(myMonth==Month.DECEMBER){
            System.out.println("Snow Time");
        }
        else if(myMonth==Month.MARCH){
            System.out.println("Welcome Spring");
        }
        else if(myMonth==Month.JUNE){
            System.out.println("Summer Time");
        }
        else if (myMonth==Month.SEPTEMBER){
            System.out.println("Leaves fall");
        }
    }
}
