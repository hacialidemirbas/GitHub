package JavaFinalReview;

public class EdabitIP {
    public static void main(String[] args) {
        String str="123.45.67.89";
        String str2="1.2.3.4";
        String str3="123.045.067.089";
        System.out.println(isValidIP(str));
        System.out.println(isValidIP(str2));
        System.out.println(isValidIP(str3));
    }
    public static boolean isValidIP(String str) {
        String[] arr = str.split("\\.");

        if (arr.length != 4   ||  str.contains(" ") || str.contains(".0")) return false;

        for (int i = 0; i < 4; i++) {
            try {
                if (Integer.parseInt(arr[i]) > 255 || Integer.parseInt(arr[i]) < 0)  return false;
            }
            catch (Exception e){
                return false;
            }
        }

        return true;
    }
}
    /*isValidIP("1.2.3.4") ➞ true

        isValidIP("1.2.3") ➞ false

        isValidIP("1.2.3.4.5") ➞ false

        isValidIP("123.45.67.89") ➞ true

        isValidIP("123.456.78.90") ➞ false

        isValidIP("123.045.067.089") ➞ false*/