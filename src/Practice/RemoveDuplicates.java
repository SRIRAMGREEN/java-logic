package Practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,5,2,10,15,32,23,45,10,2,3,15);

        List<Integer> collect = list.stream().filter(integer -> Collections.frequency(list, integer) > 1).distinct().collect(Collectors.toList());
        System.out.println(collect);
    }
}
