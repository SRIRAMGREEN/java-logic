package exercise;

import java.util.*;

public class StringToMap {
    public static void main(String[] args) {
        String word = "name:anbu,department:biology,rank:3";
        Map<String,String> wordMap = new TreeMap<>();

        String[] wordArray = word.split(",");
        System.out.println(Arrays.toString(wordArray));

        for (int i=0;i< wordArray.length;i++){
            String[] word1 = wordArray[i].split(":");
            wordMap.put(word1[0],word1[1]);
        }
        System.out.println(wordMap);
    }
}
