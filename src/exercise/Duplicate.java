package exercise;

import java.util.*;
import java.util.stream.Collectors;

public class Duplicate {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(1,3,7,32,4,67,89,4,5,1,3,32,99);

        Set<Integer> num = numList.stream()
                //frequency method will check the number of times the integers are occuring
                //numlist name of the list  is from where the integers are checked , e - integer reference
                //>1is used to check if the integers are occuring more than 1 time
                .filter(e -> Collections.frequency(numList, e) > 1)
                .collect(Collectors.toSet());

        System.out.println("numbers which are occuring more than one time: "+num);
        //-------------------------------------------------------------------------

//        String word = "abadiam";
//
//        for (int i = 0; i < word.length(); i++) {
//            char c = word.charAt(i);
//            if(word.contains(c))
//        }




        //-------------------------------------------------------------------

        Set<Integer> s = numList.stream().collect(Collectors.toSet());
        System.out.println("using set "+s);


        Set<Integer> dupNum = new HashSet<Integer>();
        Set<Integer> dup = numList.stream()
                //here the add method return boolean since it add the values
                //we make dupNUm as false since it will add only dupicate.
                .filter(e->!dupNum.add(e))
                .collect(Collectors.toSet());
        System.out.println("finding duplicates using set: "+dup);



    }
}
