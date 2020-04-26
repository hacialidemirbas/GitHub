package Collections;

public class EdabItState {
           public static void main(String[] args) {
            String states[] = {"Arizona","CA","NY","Nevada"};
            listStates(states,"abb");
            listStates(states,"full");
            listStates(states,"asd");
        }
        public static void listStates(String states[],String way){
            if(way.equals("abb")){
                for(String state : states){
                    if(state.length()==2){
                        System.out.println(state);
                    }
                }
            }
            else if(way.equals("full")){
                for(String state : states){
                    if(state.length()>2){
                        System.out.println(state);
                    }
                }
            }
            else{
                System.out.println("invalid parameter");
            }
        }

    }
