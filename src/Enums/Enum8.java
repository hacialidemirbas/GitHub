package Enums;

import java.util.Arrays;


public class Enum8 {
    public enum Colors {
        MAROON(155, 200, 180),
        TEAL(10, 230, 50),
        GREEN(0, 255, 0),
        BLUE(0, 0, 255);

        private int red;
        private int green;
        private int blue;

        Colors(final int red, final int green, final int blue) {
            this.red = red;
            this.green = green;
            this.blue = blue;
        }
       public int red() {
            return this.red;
        }
        public int green() {
            return this.green;
        }
       public int blue() {
            return this.blue;
        }
        public int[]colors(){
    int allColors[]=new int[3];
            allColors[0]=this.red;
            allColors[1]=this.green;
            allColors[2]=this.blue;
            return allColors;
        }
        public static void main(String[] args) {
            Colors myColor = Colors.MAROON;
            System.out.println(Arrays.toString(myColor.colors()));
        }


    }
}