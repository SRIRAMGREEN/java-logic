package Practice;

import java.util.ArrayList;
import java.util.List;

public class Occurance {
    public static void main(String[] args) {
        String word = "benagben";
        String testWord = "ben";
        int testWordlength = testWord.length();
        StringBuffer buffer=new StringBuffer();
        List<String> wordList = new ArrayList<>();

        for (int i=0;i<word.length();i++) {
            if (testWordlength <= word.length()) {
                for (int j = i; j < testWordlength; j++) {
                    buffer.append(word.charAt(j));
                }
                if (buffer.toString().equalsIgnoreCase(testWord)) {
                    wordList.add(buffer.toString());
                }
                buffer.setLength(0);
                testWordlength++;
            }
            else{
                break;
            }
        }

        System.out.println(wordList);
    }
}
