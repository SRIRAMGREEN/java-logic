package Java8;

import java.util.*;
import java.util.stream.Collectors;

public class CharOccurance {
    public static void main(String[] args) {
        char[] letters = {'a','b','c','b','c','a','d','d','d'};
        List<Character> characterList = new String(letters).chars().mapToObj(single->(char)single).collect(Collectors.toList());
//        List<Character> characterList =List.of(letters);  //cannot convert primitive type of array directly to list.

        List<Character> characters = characterList.stream().filter(charValue -> Collections.frequency(characterList, charValue) > 1).collect(Collectors.toList());
        System.out.println(characters);

        Map<Character,Integer> charMap = new LinkedHashMap<>();
        for (Character val:characters){
            if (!charMap.containsKey(val)){
                for (Map.Entry<Character,Integer> value: charMap.entrySet()){
                    if (value.getKey().equals(val)){
                        charMap.put(value.getKey(), value.getValue()+1);
                    }
                }
            }
        }
        System.out.println(charMap);

        //to find the unique char count
        //it gives the overall count of unique chars
//        long count = characters.stream().distinct().count();
//        System.out.println("unique characters count: "+ count);

        //to get the count of duplicates
        int size = characters.size();
        System.out.println("duplicate chars count: "+ size);
    }
}
