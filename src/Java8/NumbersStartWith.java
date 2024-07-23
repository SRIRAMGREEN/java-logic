package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumbersStartWith {
    public static void main(String[] args) {
        // find numbers starting with 2.

        List<Integer> numList = Arrays.asList(2,674,454,-27,216,245,360);

//        List<Integer> collect = numList.stream().map(element -> String.valueOf(element))
//                //startsWith will work only for string
//                .filter(element -> element.startsWith("2")||element.startsWith("-2"))
//                .map(Integer::valueOf)
//                .collect(Collectors.toList());
//        System.out.println(collect);


        List<Integer> collect = numList.stream().map(value -> String.valueOf(value))
                .filter(value -> value.startsWith("2"))
                .map(Integer::valueOf)
                .collect(Collectors.toList());
        System.out.println(collect);




    }
}
