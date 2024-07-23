package vasanth.strings;

import java.util.HashMap;
import java.util.Map;

public class StringOccurance {
    public static void main(String[] args) {
        String word = "adam";
        Map<Character,Integer> mapValue = new HashMap<>();
        for (int i=0; i<word.length();i++){
            if (mapValue.containsKey(word.charAt(i))){
                for (Map.Entry<Character,Integer> value: mapValue.entrySet()){
                    if(value.getKey().equals(word.charAt(i))){
                        mapValue.put(value.getKey(),value.getValue()+1);
                    }
                }
            }else {
                mapValue.put(word.charAt(i),1);
            }

        }
        System.out.println(mapValue);
    }
}
