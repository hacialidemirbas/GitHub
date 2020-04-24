package OCA;

public class exceptions1 {
    public static void main(String[] args) {
        String[]arr=new String[]{"123","432","543","abc"};
       try{ for(int i=0;i<=arr.length;i++){
            int j=Integer.parseInt(arr[i]);
            System.out.println(j);
        }
           throw new IllegalArgumentException("This is my illegal argument exception");
       }

       catch (ArrayIndexOutOfBoundsException e){
           System.out.println("Caughtg an ArrayIndexOutOfBoundsException, but no problem");
       }
       catch(NumberFormatException e){
           System.out.println("Caught an NumberFormatException. No proplem");//loop doesn't reach ArrayIndexOutOfBoundsException
       }
       catch (Exception e){
           System.out.println("Caught an exception. All fine");
       }
    }
}
