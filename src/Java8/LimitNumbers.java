package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3,9,10,2,18,45,7,1,69,34);

        //get first 5 numbers-------->sum of 5 numbers

        List<Integer> list = numbers.stream().limit(5).collect(Collectors.toList());
        System.out.println("first 5 numbers"+list);

        Integer sum = numbers.stream().limit(5).reduce((p, q) -> p + q).get();
        System.out.println("adding first 5 values: "+sum);

        //skip:-->skip first 3 numbers
        List<Integer> skip = numbers.stream().skip(3).collect(Collectors.toList());
        System.out.println("skip first 3 numbers "+skip);

        int skipSum =numbers.stream().skip(3).reduce((a,b)->a+b).get();
        System.out.println("skip the first three numbers and add the remaining numbers "+skipSum);
    }
}
