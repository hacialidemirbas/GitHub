package CollectionReview;

import java.util.HashMap;

public class ElectionWinner {
    public static void main(String[] args) {
        String []candidates={"ali","veli","hasan","huseyin","ali","veli",
                "hasan","huseyin","ayse","fatma","ali","veli","hasan",
                "huseyin","ayse","fatma","veli","hasan","ayse","fatma",
                "ali","veli","hasan","huseyin","ayse","fatma","veli",
                "hasan","huseyin","ayse","fatma","ali","veli","hasan",
                "huseyin","ayse","fatma"};
        HashMap<String,Integer>votes=new HashMap<>();
       for (String person:candidates){
           if(votes.containsKey(person)){
               votes.put(person,votes.get(person)+1);
           }
           else{
               votes.put(person,1);
           }

       }
        System.out.println(votes);
                int maxVote=0;
        String winner="";
                    for (String vote:votes.keySet()){
                if(votes.get(vote)>maxVote){
                    maxVote=votes.get(vote);
                    winner=vote;

                }

            }


        System.out.println("The winner is "+winner+"   with  "+maxVote+"    votes.");
    }
}
