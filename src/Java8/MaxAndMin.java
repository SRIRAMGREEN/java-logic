package Java8;

import java.util.*;
import java.util.stream.Collectors;

public class MaxAndMin {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(1,14,9,45,-5,10,7,45,0,36,27,27);
        Integer maxi = numList.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("maximum number "+maxi);

        Integer mini = numList.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("minimum number "+mini);


        //
        //second highest number
        //while sorting we use sorted(Collections.reverseOrder()) to sort in reverse order the max. number will come to first index.
        //we have duplicate max. numbers. so we need to make it single so we use dictinct().
        //we use skip() the first num here so we are skipping the first value.
        int secondHighest = numList.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
        System.out.println("second highest number " +secondHighest);




        //second lowest
        //we use sorted() method alone as it will sort the values in ascending order.
        //we have duplicate max. numbers. so we need to make it single so we use dictinct().
        //we use skip() the first num here so we are skipping the first value.

        int secondLowest = numList.stream().sorted().distinct().skip(1).findFirst().get();
        System.out.println("second lowest number "+secondLowest);
    }
}
