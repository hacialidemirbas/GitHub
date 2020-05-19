package InterviewQuestions;

public class LargestValue {
    public static void main(String[] args) {
        int[] arr={6,1,2,3,4,3,2,19};
        findLargestValue(arr);
    }
    public static void findLargestValue(int []a){
        int largest=0;
        for (int i = 0; i <a.length ; i++) {
            if(a[i]>largest){
                largest=a[i];
            }
        }
        System.out.println(largest);
    }
}
