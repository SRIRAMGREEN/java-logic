package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddEven {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(11,4,6,7,34,23,17,10);

        List<Integer> even = numList.stream().filter(digit -> digit % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(even);

        List<Integer> odd = numList.stream().filter(digit -> digit % 2 != 0)
                .collect(Collectors.toList());
        System.out.println(odd);
    }

}
