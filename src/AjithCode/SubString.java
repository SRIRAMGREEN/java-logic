package AjithCode;

import java.util.ArrayList;
import java.util.List;

public class SubString {
    public static void main(String[] args) {
        String a = "abcabcdabcdefab";
        StringBuffer buffer = new StringBuffer();
        List<String> wordList = new ArrayList<>();
        String  longestWord = "";
        int lowest = 0;
        int n=0;

        for (int i = 0; i < a.length(); i++) {
            int d = a.charAt(i);
            System.out.println(d);


//                if (d > lowest && d==lowest+1) {
            if(d>lowest){
                    lowest = d;
                    buffer.append(a.charAt(i));

            } else {
                wordList.add(String.valueOf(buffer));
                 n = buffer.length();
                buffer.setLength(0);
                lowest = a.charAt(i);
                buffer.append(a.charAt(i));
            }
        }
        wordList.add(String.valueOf(buffer));
        for(int i=0;i<wordList.size();i++){
            String s = wordList.get(i);
            if(s.length()>=n){
                longestWord=s;
            }
        }
        System.out.println(wordList);
        System.out.println("longest word: "+longestWord);


    }
}
