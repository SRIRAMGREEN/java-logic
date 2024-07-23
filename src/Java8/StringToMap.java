package Java8;

import java.util.Arrays;
import java.util.HashMap;

public class StringToMap {
    public static void main(String[] args) {
        String data = "name:Anbu;department:Biology;ramk:3";
        HashMap<String,String> mapString = new HashMap<>();


        String[] strings=data.split(";");

        for (int i=0;i<strings.length;i++){
           String[] arr= strings[i].split(":");
            mapString.put(arr[0],arr[1] );
        }
        System.out.println(mapString);
    }
}
