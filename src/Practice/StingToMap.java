package Practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class StingToMap {
    public static void main(String[] args) {
        String word = "name:Anbu,department:Biology,rank:3";
        HashMap<String,String> newMap = new HashMap<>();

        String[] wordArray = word.split(",");
        System.out.println(Arrays.toString(wordArray));

        for (int i=0;i<wordArray.length;i++){
            String[] reWord = wordArray[i].split(":");
            newMap.put(reWord[0],reWord[1]);
        }
        System.out.println(newMap);
    }
}
