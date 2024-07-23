package exercise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(24,35,12,7,9,45,63,27,25,34,7,5,23);

        Integer max = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(max);

        Integer min = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(min);
    }
}
