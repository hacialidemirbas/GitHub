package CollectionReview;

import java.util.HashMap;

public class HashMapExamples1 {
    public static void main(String[] args) {
        HashMap<String,Integer> cityTemp=new HashMap<>();
        cityTemp.put("Los Angeles",85);
        cityTemp.put("Chicago",30);
        cityTemp.put("Denver",55);
        cityTemp.put("Orlando",90);
        System.out.println(cityTemp);
        int average=0;
        for(int degree: cityTemp.values()){
            average+=degree;
        }
        System.out.println("Average Temp : "+(average/cityTemp.size()));

    }
    }

