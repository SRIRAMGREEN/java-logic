package AjithCode;

import java.util.ArrayList;
import java.util.List;

public class FindIndexOfSubString {
    public static void main(String[] args) {


        String word = "binagbin";
        StringBuffer check = new StringBuffer();
        List<String> list = new ArrayList<>();

        String findWord = "bin";
        int length = findWord.length();
        int wordLength = word.length() - length;


        for (int j = 0; j <= wordLength; j++) {
            for (int i = j; i < length; i++) {
                char val = word.charAt(i);
                check.append(val);
            }
            if (check.toString().equals(findWord)) {
                list.add(check.toString());
            }
            check.setLength(0);
            length++;
        }
        System.out.println(list);
    }
}
