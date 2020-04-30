package Enums;

public class Enum4 {
    enum Skillset{ JAVA, SELENIUM, SQL}
    public static void main(String args[]){
        Skillset sbj=Skillset.JAVA;

        switch(sbj){
            case SELENIUM:
                System.out.println("YOU ARE ALREADY A TESTER");
                break;
            case SQL:
                System.out.println("Database");
                break;
            case JAVA:
                System.out.println("JAVA IS LOVE");
                break;
        }
    }
}
