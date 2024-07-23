package PracticeCode;

import java.util.ArrayList;
import java.util.List;

public class IndexOfSubstring {
    public static void main(String[] args) {
        String word = "benagben";
        String  findWord = "ben";
        List<String> wordList = new ArrayList<>();
        StringBuffer buffer=new StringBuffer();
        List<Integer> indeces = new ArrayList<>();

        int wordLength = word.length();
        int findWordLength =findWord.length();

        for (int i=0;i<wordLength;i++) {
            if (findWordLength <= wordLength) {
                for (int j = i; j < findWordLength; j++) {
                    buffer.append(word.charAt(j));

                }
                if (buffer.toString().equals(findWord)) {
                    if (word.charAt(i) == findWord.charAt(0)) {
                        int in = i;
                        indeces.add(in);
                    }
                    wordList.add(buffer.toString());

                }
                buffer.setLength(0);
                findWordLength++;
            }
            else{
                break;
            }
        }

        System.out.println(wordList);
        System.out.println(indeces);

    }
}
