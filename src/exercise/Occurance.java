package exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Occurance {
    public static void main(String[] args) {
        int[] num = {1, 1, 1, 2, 2, 3};
        int occurance = 2;
        int count = 0;

        // the output is {1,2};
        // the given array has some repeated numbers
        // need to find the 2 times occured values


        HashMap<Integer,Integer> mapVal = new HashMap<>();

        for (int n:num){
            if (mapVal.containsKey(n)) {
            for (Map.Entry<Integer,Integer> entry: mapVal.entrySet()){
            if (entry.getKey().equals(n)){
            mapVal.put(entry.getKey(),entry.getValue()+1);
                }
              }
            }else{
                mapVal.put(n,1);
            }
        }

        System.out.println(mapVal);
    }
}
