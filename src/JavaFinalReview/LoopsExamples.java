package JavaFinalReview;

public class LoopsExamples {
    public static void main(String[] args) {
        for (int i = 0, j=10;     i <10 &&j>0     ; i++,j--) {
            //initialization       condition        increment/decrement
            System.out.println("i="+i+"\tj="+j);
        }
        StringBuilder word= new StringBuilder("Java is fun");
        char temp;
        for (int i = 0, j=word.length()-1; i <j ; i++,j--) {
            temp=word.charAt(i);
            word.setCharAt(i,word.charAt(j));
            word.setCharAt(j,temp);

        }
        System.out.println(word);
        int counter=0;
        for(;;){
            System.out.println("Hello");
            if(counter==5){
                break;
            }
            counter++;
        }
        String arr[]= {"abc", "def", null, ""} ;
        for (String x:arr ) {
            if(x==null){
                break;
            }
            System.out.println(x);
        }
    }
}
