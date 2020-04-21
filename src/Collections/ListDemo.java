package Collections;

import JavaReview.Student;

import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.getName();

        ArrayList<String> list1=new ArrayList<>();
        ArrayList list2=new ArrayList();
        list1.add("John");
        list1.add("Jack");
        list1.add("Jeremy");
        list1.add("Tom");
        list1.add("Linda");
        list1.add("John");
        list1.add("Jennie");
        //list1.add(10);// only String
        list2.add("John");
        list2.add(5);
        list2.add(2.2);
        list2.add("John");
        list2.add(s1);
        System.out.println(list1);
        System.out.println(list2);
        String name=list1.get(2);
        System.out.println("name is: "+name) ;
        Object o=list2.get(2);
        System.out.println("o is: "+o+" "+list2.get(2)) ;
        list1.set(2,"Fiona");
        System.out.println("List1 is now :"+list1);
        list1.remove(3);
        System.out.println("List1 is now :"+list1);
        if(list1.contains("John")){
            System.out.println("John is in the list1");
            System.out.println("====Iterating with Enhanced For Loop====");
            for(String str:list1){
                System.out.println(str);
                           }
            System.out.println("====Iterating with For Loop====");
            for(int i=0; i<list1.size();i++){
                System.out.println(list1.get(i));
            }
            System.out.println("===================================");
            System.out.println("====Iterating with Iterator===");
            Iterator<String> itr=list1.iterator();
            System.out.println(itr.next());
            while(itr.hasNext()){
                String str=itr.next();
                System.out.println(str);
                if (str.equals("Jack")){
                    itr.remove();
                }
            }
            System.out.println("===========================");
            System.out.println("List after iteration is: "+list1);

        }




    }

}
