package exercise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartsWith {
    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(2,45,207,-256,56,76,27,23,200,455,600,203);

        //print all numbers starts with 2

        List<Integer> numlist = num.stream()
                //since I need to filter the elements starting with "2"
                .map(e -> String.valueOf(e))
                .filter(e -> e.startsWith("2")||e.startsWith("-2"))
                .map(Integer::valueOf).collect(Collectors.toList());
        System.out.println(numlist);
    }
}
