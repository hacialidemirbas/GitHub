package Projects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class HangmanAttempt {
    public static void main(String[] args) {
        attempts("java");
    }
    public static void attempts(String word){
        Stack<String> hangman=new Stack<>();
        hangman.push("Rope");
        hangman.push("Tree");
        hangman.push("Legs");
        hangman.push("Torso");
        hangman.push("Arms");
        hangman.push("Head");
        Scanner scanner=new Scanner(System.in);
        String letter;
        List<String>noMatches= new ArrayList<>();
        while(!hangman.isEmpty()){
            System.out.println("Enter your letter: ");
            letter=scanner.next();
            if(!word.contains(letter)){
                noMatches.add(hangman.pop());
                System.out.println(noMatches);
            }
        }
    }
}
