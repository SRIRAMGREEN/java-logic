package Java8;

import java.util.HashMap;
import java.util.Map;

public class LetterOccurance {
    // need to find the number of times the letters are present
    public static void main(String[] args) {
        char[] letters = {'a','b','c','b','c','a','d','d','d'};
        HashMap<Character,Integer> letterMap = new HashMap<>();


        for (int i=0; i<letters.length;i++){
            if (letterMap.containsKey(letters[i])){
                for (Map.Entry<Character,Integer> value: letterMap.entrySet()){
                    if (value.getKey().equals(letters[i])){
                        letterMap.put(value.getKey(),value.getValue()+1);
                        break;
                    }
                }
            }
            else {
                letterMap.put(letters[i],1);
            }
        }
        System.out.println(letterMap);
    }
}
