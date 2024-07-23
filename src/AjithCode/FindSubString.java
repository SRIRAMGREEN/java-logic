package AjithCode;

import java.util.*;

public class FindSubString {
    public static void main(String[] args) {
        String[] words = {"greatness","ungreatful","great","disgrace", "greatful"};
        List<String> wordList = new ArrayList<>();
        int count = 0;
        int totalcount=0;



        Arrays.sort(words, Comparator.comparing(String::length));
        System.out.println("*********"+Arrays.toString(words));
        totalcount= words.length;
            String minWord = words[0];



            for (String word : words) {
                if (word.length() < minWord.length()) {
                    minWord = word;
                }
                if(word.contains(minWord)){
                    count=count+1;

                }
            }


        System.out.println("total words count: "+totalcount);
        System.out.println("common sub string: "+count);
        System.out.println(">>>>>>>>>>>>>>>>>"+minWord);

    }
}
