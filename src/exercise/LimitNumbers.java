package exercise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitNumbers {

    //get list of numbers

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(24,35,12,7,9,45,63,27,25,34,7,5,23);

        //get first 5 numbers ----> sum of 5 numbers

        List<Integer> nums = list.stream().limit(5).collect(Collectors.toList());
        //stream--> to get all the numbers in the list.
        //limit --> to fix the max numbers we want from the streamed list.
        //collect --> collect those limited numbers.
        //Collectors.tolist() --> get the collected limited numbers and then give in the form of list.
        System.out.println(nums);


        //adding the listed numbers.
        Integer sum = list.stream().limit(5).reduce((p, q) -> p + q).get();
        System.out.println(sum);


        //skip
        //giving the list of all numbers after first 5 numbers.
        List<Integer> numsss = list.stream().skip(5).collect(Collectors.toList());
        System.out.println(numsss);


        //skipping the first 5 numbers and then adding all the remaining numbers.
        Integer skipsum = list.stream().skip(5).reduce((a, b) -> a + b).get();
        System.out.println(skipsum);
    }
}
