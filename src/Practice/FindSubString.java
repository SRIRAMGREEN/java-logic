package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class FindSubString {
    public static void main(String[] args) {
        String[] words ={"wonderla","wonderful","wonder","wonderness"};
        Arrays.sort(words, Comparator.comparing(String::length));
        int count=0;


        List<String> wordList = new ArrayList<>();
        String minWord =words[0];

        for (String word:words){
            if(word.length()<minWord.length()){
                minWord=word;
            }
            if (word.contains(minWord)){
                count = count+1;
                wordList.add(minWord);
            }

        }

        System.out.println(count);
        System.out.println(minWord);
        System.out.println(wordList);
    }
}
