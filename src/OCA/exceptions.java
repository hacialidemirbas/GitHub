package OCA;

public class exceptions {
    public static void main(String[] args) {
        int num=2;
        int num1=0;
       divide(num,num1);
     //   throw new RuntimeException("Y123546i780yjmdghh");
        /*String numStr="123abc";
        int numInt=Integer.parseInt(numStr);
        System.out.println(numInt);*/
       }
       private static void divide(int num1,int num2){
           try{
               System.out.println(num1/num2);}
           catch(Exception e){
               System.out.println("ArithmeticException");
              // throw new RuntimeException("You are trying to divide by zero.Are you stupid");
              // System.out.println(e.getCause());
              // System.out.println(e.getMessage());
              // e.printStackTrace();
           }
       }

}
