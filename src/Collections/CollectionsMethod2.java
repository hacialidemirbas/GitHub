package Collections;

import java.util.*;

public class CollectionsMethod2 {
    public static void main(String[] args) {
        LinkedList<Integer>nums= new LinkedList<>();
        nums.add(3);
        nums.add(5);
        nums.add(1);
        nums.add(2);
        nums.add(6);
        nums.add(4);
        nums.add(7);
        System.out.println(nums);
        Collections.sort(nums);
        System.out.println("=================Sorted================");
        System.out.println(nums);
        nums.forEach(System.out::println);
        Collections.reverse(nums);
        nums.forEach(System.out::println);
        System.out.println("========================Random Numbers========================");
        List<Integer> numbers=new LinkedList<>();
        Random rndm=new Random();
        for(int i=0;i<1000;i++){
numbers.add(rndm.nextInt(1000));
        }
        System.out.println(numbers);
        Collections.sort(numbers);
        Collections.reverse(numbers);
        System.out.println("============Alternative way=================");
        Iterator<Integer> itr=numbers.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
    }
        //copy method
        List<Integer> newList = new LinkedList<Integer>();
        for(int i =0 ; i<50 ; i++){
            newList.add(i);
        }
        try {
            Collections.copy(newList,numbers);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("oops");
        }
        System.out.println(newList);
        //fill method
        Collections.fill(newList,5);
        System.out.println(newList);
        //frequency
        int freq=Collections.frequency(newList,5);
        System.out.println(freq);
        //max
        System.out.println(Collections.max(numbers));



    }}
