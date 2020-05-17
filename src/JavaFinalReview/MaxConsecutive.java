package JavaFinalReview;

public class MaxConsecutive {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,6,7,8,9};

        System.out.println(findLongestConsecutive(arr));
    }
    public static int  findLongestConsecutive(int []arr){
        int count=1;
        for (int i = 0; i <arr.length-1 ; i++) {
            if(Math.abs(arr[i+1]-arr[i])==1){
                count++;
            }
            else{
                count=1;
            }

        }
        return count;
    }
}
