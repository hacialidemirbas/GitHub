package Sorting;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {
        List<Students> students = new ArrayList<>(10);
        students.add(new Students(100,"Vahit",15));
        students.add(new Students(101,"Ismayil",12));
        students.add(new Students(102,"Sibel",8));
        students.add(new Students(103,"Birsen",14));
        Collections.sort(students,new AgeSort());
        System.out.println("Sorting acording to Age\n===============================");
        for(Students st:students){
            System.out.println(st.id+"\t"+st.name+"\t"+st.age);
                    }
        System.out.println("Sorting acording to ID numbers\n===============================");
        Collections.sort(students,new IdSort());
        for(Students sts:students){
            System.out.println(sts.id+"\t"+sts.name+"\t"+sts.age);
    }
        System.out.println("Sorting acording to Names\n===============================");
        Collections.sort(students,new NameSort());
        for(Students sts:students){
            System.out.println(sts.id+"\t"+sts.name+"\t"+sts.age);}
    }}