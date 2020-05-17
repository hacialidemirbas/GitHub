package Exercises;

public class CodeLab20715 {
    public static void main(String[] args) {
        boolean duplicates=false;
        int zipcodeList[]={1,1,2};
        int j, k;
        for(k=0;k<zipcodeList.length/2;k++){
            for(j=1;j<zipcodeList.length;j++){
                if(zipcodeList[k]==zipcodeList[j]){
                    duplicates=true;
                    break;}
            }}
        System.out.println(duplicates);
    }
}
