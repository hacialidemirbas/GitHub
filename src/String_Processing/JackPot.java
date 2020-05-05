package String_Processing;

public class JackPot {
    public static void main(String[] args) {
        String[] arr={"&","&","&"};
        String[]arr1={"$%","$%","$*"};
        System.out.println(isJackPot(arr));
        System.out.println(isJackPot(arr1));
    }
    public static boolean isJackPot(String arr[]){
        String element=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (!arr[i].equals(element)){
                return false;
            }

        }
        return true;
    }
}
