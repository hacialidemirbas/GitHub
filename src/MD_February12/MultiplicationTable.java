package MD_February12;

public class MultiplicationTable {
    public static void main(String[] args) {
        for(int i=1 ; i<11 ; i++){
            for(int j=1 ; j<=10 ; j++){
                System.out.println(i+" X " + j + " = " + (i*j) );
            }
            System.out.println("_________________");
        }
    }
}
