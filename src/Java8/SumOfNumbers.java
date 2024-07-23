package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfNumbers {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,4,5,6);

        Optional<Integer> sum = num.stream().reduce((a, b) -> a + b);
        System.out.println("Added value: "+sum.get());

        //---------------------------------------------------------------------
        //Average:
        List<Integer> numList =Arrays.asList(2,4,3,7,2);
        double average = numList.stream().mapToInt(v -> v).average().getAsDouble();
        System.out.println("Average value is "+average);
    }
}
