package Java8;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,5,2,10,15,32,23,45,10,2,3,15);

        List<Integer> collect = list.stream().filter(integer -> Collections.frequency(list, integer) > 1).distinct().collect(Collectors.toList());
        System.out.println("list of values using distinct() "+collect);

        Set<Integer> collect1 = list.stream().filter(value -> Collections.frequency(list, value) > 1).collect(Collectors.toSet());
        System.out.println("set of values using set "+collect1);


        List<Integer> numList = Arrays.asList(1,14,9,45,-5,10,7,45,0,36,27,27);

        //max
        Integer maxi = numList.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(maxi);

        //mini
        Integer mini = numList.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(mini);

        //secLargest
        Integer secLarge = numList.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
        System.out.println(secLarge);

        //secLow
        Integer secLow = numList.stream().sorted().distinct().skip(1).findFirst().get();
        System.out.println(secLow);
    }
}
