package vasanth.strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestSubstring {
    //find the length of longest substring
    //the substring should not have repeated characters.
    public static void main(String[] args) {
        String word = "abcabcdbb";
        Set<Character> stringSet = new HashSet<>();
        StringBuffer buffer = new StringBuffer();

        int length=0;


        for (int a=0; a<word.length(); a++){
            stringSet.add(word.charAt(a));
        }
        for(Character c:stringSet){
            buffer.append(c);
        }
        String words = buffer.toString();
        length = stringSet.size();
        System.out.println(stringSet);
        System.out.println("longest sub string: "+ words);
        System.out.println("length of substring: "+length);
    }
}
