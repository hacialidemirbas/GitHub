package Exercises;

public class Algorithm {
    public void head(int height){
        if(height==0)
            return;
        head(height-1);
        System.out.println(height);
    }
    public void tail(int height){
        if(height==0)
            return;
        System.out.println(height);
        tail(height-1);
    }

    public static void main(String[] args) {
        Algorithm algorithm= new Algorithm();
        algorithm.head(4);
        algorithm.tail(4);
    }
}
