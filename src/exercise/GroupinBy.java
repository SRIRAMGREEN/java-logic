package exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class GroupinBy {
    public static void main(String[] args) {
//find sum of all numbers
        List<Integer> list = Arrays.asList(2,56,75,34,56,34,78,2,4,67);
        Optional<Integer> reduce = list.stream().reduce((a, b) -> a + b);
        // the reduce method will takes any two values and assigned to lambda to perfom the addidtion action.
        //It will give the optional Integer.
        System.out.println("sum of numbers: "+ reduce);
    }
}
