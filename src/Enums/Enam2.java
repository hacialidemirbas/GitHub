package Enums;

public class Enam2 {
    enum season {
        SPRING, SUMMER, FALL, WINTER
    }
    public static void main(String[] args) {
        for(season sn:season.values()){
            System.out.println(sn);
        }
    }

}
