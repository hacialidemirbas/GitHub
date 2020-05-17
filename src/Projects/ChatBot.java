package Projects;

import java.util.ArrayList;
import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {

        askQuestion();
    }
    public static void askQuestion(){
        String questions[]={"What is your favorite color?",
        "Do you like watching movies?",
        "Did you watch Toy Story 4?",
        "You are right...",
        "I don't think so...",
        "Why not :)"};
        //return questions[(int)(Math.random()*questions.length)];
        ArrayList<Integer> indexes = new ArrayList<>();
        System.out.println("Hello How are you today?");
        int index;
        Scanner scanner = new Scanner(System.in);
        String answer;
        while(indexes.size()!=questions.length){
            index = (int) (Math.random()*questions.length);
            //System.out.print("index="+index+"\t");
            if(!indexes.contains(index)) {
                System.out.print(questions[index]+": ");
                answer = scanner.nextLine();
                indexes.add(index);
                System.out.println("Ok you said \""+answer+"\"");
            }
        }}
}
