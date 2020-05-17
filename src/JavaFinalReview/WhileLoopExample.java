package JavaFinalReview;

public class WhileLoopExample {
    public static void main(String[] args) {
        while(true){
            for (int i = 0; i <10 ; i++) {
                System.out.println("Hello");
                if(i==5){
                    break;
                }
            }
            System.out.println("while scope");
            if(true) break;
        }
        int x=0,y=30,z=50;
        while(x<y&&y<z){
            System.out.println("x= "+x+"\ty="+y+"\tz="+z);
            x+=3;
            y+=2;
            z+=1;


        }
    }
}
