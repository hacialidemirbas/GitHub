package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ConvertBinaryToInteger {
    public static void main(String[] args) {
        List<Integer> nums=new LinkedList<>(Arrays.asList(1,0,0,0,0,0));
        System.out.println(convertToDecimal(nums));

    }
    public static int convertToDecimal(List<Integer>nums){
        List<Integer>powers=new ArrayList<>();
        int converted=0;
        for(int  i=nums.size()-1;i>=0;i--){
            powers.add((int)Math.pow(2,i));

        }
        System.out.println(powers);
        for(int i=0;i<nums.size();i++){
            converted+=nums.get(i)*powers.get(i);
        }
        return converted;
    }
}
