package CSTamil;

import java.util.Arrays;
import java.util.Comparator;

public class FindSubstring {
    public static void main(String[] args) {
        // find the substring
        String[] words = {"goodness","good","godess","goodbye"};
        int totalWordCount = 0;
        int count = 0;

        Arrays.sort(words, Comparator.comparing(String::length));
        totalWordCount= words.length;
        String minWord = words[0];
        int minWordLength = minWord.length();

        for (String word:words){
            if (word.length()<minWordLength){
                minWord=word;
            }
            if (word.contains(minWord)){
                count=count+1;
            }
        }
        System.out.println("total word count: "+totalWordCount);
        System.out.println("minword: "+minWord);
        System.out.println("total substring count: "+count);


    }
}
