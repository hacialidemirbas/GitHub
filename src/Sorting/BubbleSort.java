package Sorting;
import java.util.Arrays;
public class BubbleSort {
        public static void main(String[] args) {
            int a=10;
            int b=20;
            int temp;

            System.out.println("a:"+a+"b:"+b);
            temp = a;
            a = b;
            b = temp;
            System.out.println("a:"+a+"b:"+b);

            int nums[] = {5,1,4,3};
            bubbleSort(nums);
            System.out.println(Arrays.toString(bubble_Sort(nums)));
        }
        public static void bubbleSort(int arr[]){
            int temp;
            for (int i = 0; i < arr.length ; i++) {
                System.out.println("PASS"+(i+1));
                System.out.println(Arrays.toString(arr));
                for (int j = 0; j < arr.length-1 ; j++) {
                    System.out.print(arr[j]+">"+arr[j+1]+"="+(arr[j]>arr[j+1]));
                    if(arr[j]>arr[j+1]){
                        temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                    System.out.print("  arr:" + Arrays.toString(arr)+"\t");
                }
                System.out.println();
            }
        }
        public static int[] bubble_Sort(int arr[]){
            int temp;
            for (int i = 0; i < arr.length ; i++) {
                for (int j = 1; j < arr.length ; j++) {
                    if(arr[j-1]>arr[j]){
                        //then swap
                        temp = arr[j-1];
                        arr[j-1] = arr[j];
                       arr[j] = temp;
                    }
                }
            }
            return arr;
        }

    }