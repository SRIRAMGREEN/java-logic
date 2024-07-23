package Java8;

import java.util.ArrayList;
import java.util.List;

public class Occurance {
    public static void main(String[] args) {
        String word = "benagben";
        String testWord = "ben";
        int wordLength =word.length();
        int testWordLength =testWord.length();
        StringBuffer buffer = new StringBuffer();
        List<String> wordList = new ArrayList<>();

        for (int i = 0; i < wordLength; i++) {
            if (testWordLength<=wordLength) {
                for (int j = i; j < testWordLength; j++) {
                    buffer.append(word.charAt(j));
                }
                if (buffer.toString().equals(testWord)) {
                    wordList.add(buffer.toString());
                }
                buffer.setLength(0);
                testWordLength++;
            }
            else {
                break;
            }


        }
        System.out.println(wordList);
    }
}
