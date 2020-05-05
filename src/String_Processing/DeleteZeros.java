package String_Processing;

public class DeleteZeros {
    public static void main(String[] args) {
        String nums="000230435000";
        System.out.println(deleteZeros(nums));

    }
    public static String deleteZeros(String numbers){
      StringBuilder myBuilder= new StringBuilder(numbers);
        for (int i = 0; i <numbers.length() ; i++) {
          if(myBuilder.charAt(i)==48)  {
              //myBuilder.append(numbers.charAt(i));
              myBuilder.deleteCharAt(i);
          }
          else{
              break;
          }
        }
        return myBuilder.toString();
    }
}
