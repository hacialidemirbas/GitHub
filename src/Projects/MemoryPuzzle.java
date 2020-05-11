package Projects;

import java.util.Scanner;

public class MemoryPuzzle {
    public static void main(String[] args) {
        String [][]puzzle={{"A","A","B","B"},
                {"C","C","D","D"},
                {"E","E","F","F"}};
        int status[][]=new int[puzzle.length][puzzle[0].length];
        status [0][1]=1;
        Scanner scanner=new Scanner(System.in);
        char letter='a';
        System.out.println("\t1\t2\t3\t4\t");
        for (int i = 0; i <puzzle.length ; i++) {
            System.out.print(letter+"\t");
            for (int j = 0; j <puzzle[0].length ; j++) {
                if (status[i][j]==0){
                    System.out.print("*\t");
                }
                else{
                    System.out.print(puzzle[i][j]+"\t");
                }

            }
            System.out.println();
            letter ++;

        }
        String location;
        int[]loc={0,0};
        System.out.println("Firt Location ");
        location=scanner.next();
    }
}
