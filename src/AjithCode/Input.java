package AjithCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Input {
    public static void main(String[] args) {
      String word = "sanjajy";
      char s = 'j';
        List<Character> n =new ArrayList<>();
char d =' ';
for (int i=0;i<word.length();i++){
        if(word.charAt(i)==s){
            d=word.charAt(i);
            n.add(d);
        }
        n.add(d);

      }
        System.out.println("in a list outside loop: "+n);

    }
}
