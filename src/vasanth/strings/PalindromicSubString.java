package vasanth.strings;

import java.util.ArrayList;
import java.util.List;

public class PalindromicSubString {
    public static void main(String[] args) {
        String word = "MADAMMADAM";
        List<String> wordList = new ArrayList<>();

int largeLength = 0;
        for (int a = 0; a < word.length(); a++) {
            StringBuilder stringBuilder =new StringBuilder();
            for (int i = a; i<word.length(); i++) {
                String initial = stringBuilder.append(word.charAt(i)).toString();
                String reverse = stringBuilder.toString();
                StringBuilder actualReverse = new StringBuilder();
                actualReverse.append(reverse).reverse();
                if (actualReverse.toString().equals(initial) && initial.length() > 1) {
                    wordList.add(stringBuilder.toString());
                }
            }


            }
            System.out.println(wordList);
            String largeString = "";
            String[] arr = wordList.toArray(new String[0]);
            for(int k=0; k< arr.length; k++){
                if(arr[k].length()>largeLength){
                    largeLength = arr[k].length();
                    largeString=arr[k];
                }
            }
        System.out.println("longest palindrome: "+ largeString);
        System.out.println("longest length: "+ largeLength);

    }
}
