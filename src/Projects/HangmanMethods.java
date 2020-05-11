package Projects;

import java.util.Scanner;

public class HangmanMethods {
    public static String pickupWord(){
        String arr[] = {"cucumber","internet","programming","selenium"};
        return arr[(int)(Math.random()*arr.length)];
    }
    public static boolean isAllOnes(int arr[]){
        boolean result=true;
        for (int i = 0 ; i < arr.length ; i++) {
            if(arr[i]!=1){
                result = false;
            }
        }
        return result;
    }
    public static void displayWord(String word){
        Scanner scanner = new Scanner(System.in);
        String letter;
        int arr[] = new int[word.length()];
        while(!isAllOnes(arr)) {
            for (int i = 0; i < word.length(); i++) {
                if (arr[i] == 0) {
                    System.out.print(" * ");
                } else {
                    System.out.print(" " + word.charAt(i) + " ");
                }
            }
            System.out.print("Type your letter : ");
            letter = scanner.next();
            //int index;
            for (int i = 0; i < word.length(); i++) {
                if (letter.charAt(0) == word.charAt(i)) {
                    arr[i] = 1;
                }
            }
        }
        System.out.println(word);
        System.out.println("Congrats!!!....");
    }
}