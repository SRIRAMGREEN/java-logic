package AjithCode;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Occurance {
    public static void main(String[] args) {
        String s = "fgdfhbkjhktryfghbkj,h";
        String s1 = "hbk";

        List<Integer> value = new ArrayList<>();

            for (int j=0; j<s.length();j++){
                if(s.charAt(j)==s1.charAt(0)){
                    value.add(j);
                }
            }
        System.out.println("indices of the value of first character in S1:  "+value);
            int count = (int) value.stream().count();
        System.out.println("the number of occurances: "+count);

    }


}
