package OCA;

public class Exceptionex2 {
    public static void main(String[] args) {
       try{
       closeSalesForceConnection();}
       catch (Exception | SalesForceAccesException e){

       }
    }
    public static void connectToSalesForce() throws SalesForceAccesException{
        throw new SalesForceAccesException();

    }
    public static void closeSalesForceConnection()throws SalesForceAccesException{
        connectToSalesForce();
    }
}
