package Exercises;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> myArrList=new ArrayList<String>();
        String one="One";
        String two= new String("Two");
        myArrList.add(one);
        myArrList.add(two);
        ArrayList<String> yourArrList=myArrList;
        one.replace("o","B");
        for (String val:myArrList ) {
            System.out.print(val+" : ");

        }
        for(String val:yourArrList){
            System.out.print(val+" : ");
        }
        String morning="Morning";
        System.out.println("Morning"==morning);
        morning.trim();
        System.out.println(morning);
        morning.substring(0,2);
        System.out.println(morning);
    }

}
