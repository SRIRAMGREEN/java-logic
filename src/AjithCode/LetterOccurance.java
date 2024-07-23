package AjithCode;

import java.util.HashMap;
import java.util.Map;

public class LetterOccurance {
    public static void main(String[] args) {
        char[] letter = {'a', 'b', 'c', 'b', 'a' ,'c'};
        HashMap<Character, Integer> values = new HashMap<>();


        for (int i = 0; i < letter.length; i++) {
            if (values.containsKey(letter[i])) {
                for (Map.Entry<Character, Integer> va : values.entrySet()) {
                    if (va.getKey().equals(letter[i])) {
                        values.put(va.getKey(), va.getValue() + 1);
                        break;
                    }
                }
            } else {
                values.put(letter[i], 1);
            }


        }
        System.out.println(values);
    }
}
