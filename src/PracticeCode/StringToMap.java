package PracticeCode;

import java.util.TreeMap;

public class StringToMap {
    public static void main(String[] args) {

        String text = "name:Adam,department:biology,rank:3";

        TreeMap<String, String> valMap = new TreeMap<>();

        var ar = text.split(",");

        for (int i = 0; i < ar.length; i++) {
            String[] arrr = ar[i].split(":");
            valMap.put(arrr[0], arrr[1]);
        }

        System.out.println(valMap);
    }
}
