package Exercises;

import java.util.ArrayList;

public class Arraylist3 {
    public static void main(String[] args) {
        int arr1[];
        int[] arr2= new int[3];
        char []arr3= {'a','b'};
        arr1=arr2;
        //arr1=arr3;
        System.out.println(arr1[0]+"  :  "+arr1[1]);
        char[] arr4=arr3.clone();
        for(char val:arr4){
            System.out.println(val);
            System.out.println(arr3.clone());
        }
        ArrayList<String> ejg= new ArrayList<>();
        ejg.add("One");
        ejg.add("Two");
        System.out.println(ejg.contains(new String("One")));
        System.out.println(ejg);
       /* String str="game".replace('a','Z').trim().concat("Aa");
        str.substring(0,2);
        System.out.println(str);*/
        String str="game";
        str.replace('a','Z');
        System.out.println(str);
        str.trim();
        System.out.println(str);
        str.concat("Aa");
        System.out.println(str);

    }
}
class Course1 {
    private String courseName;

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }
}
class EJavaGuru {
    public static void main(String args[]) {
        Course1 c = new Course1();
        c.setCourseName("Java");
        System.out.println(c.getCourseName());
    }
}
