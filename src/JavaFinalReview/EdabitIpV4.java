package JavaFinalReview;
import java.util.Arrays;
public class EdabitIpV4 {
    public static void main(String[] args) {
        System.out.println(isValidIP("1.2.3.4"));
        System.out.println(isValidIP("1.2.3"));
        System.out.println(isValidIP("123.45.67.89"));
        System.out.println(isValidIP("123.456.78.90"));
        System.out.println(isValidIP("123.045.067.089"));
    }
    public static boolean isValidIP(String ip){
        String arr[] = ip.split("\\.");
        System.out.println(Arrays.toString(arr));
        if (arr.length != 4) {
            System.out.println("4 elements");
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].charAt(0) == '0' || arr[i].charAt(arr[i].length()-1) == '0'){
                System.out.println("Zero");
                return false;

            }
            else{
                if (!(Integer.parseInt(arr[i]) > 0 && Integer.parseInt(arr[i]) < 256)){
                    System.out.println("1-255");
                    return false;
                }
            }
        }
        return true;
    }
}
