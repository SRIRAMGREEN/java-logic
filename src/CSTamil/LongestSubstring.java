package CSTamil;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestSubstring {
    //find the longest substring which should not have repeated letters

    public static void main(String[] args) {
        String word = "abcabcbb";
        StringBuilder builder = new StringBuilder();
        List<String> wordList = new ArrayList<>();
        String longestSubstring = "";
        int ascivalue=0;
        int size = 0;

        for (int i=0; i<word.length();i++){
           int d = word.charAt(i);


                if (d>ascivalue){
                    ascivalue=d;
                    builder.append(word.charAt(i));
                }else {
                    wordList.add(builder.toString());
                    size=builder.length();
                    ascivalue=word.charAt(i);
            }
        }
        wordList.add(builder.toString());
        for (int i=0;i< wordList.size();i++){
            String s = wordList.get(i);
            if (s.length()>size){
                longestSubstring=s;
            }

        }
        System.out.println(wordList);
        System.out.println("longest substring: "+ longestSubstring);

    }
}
// abc abc bb bca bcbbcabcbbabcbbbcbbcbbbbb