package Practice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfNumbers {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,4,5,6);
        Optional<Integer> add = num.stream().reduce((a, b) -> a + b);
        System.out.println(add);

        double ave = num.stream().mapToInt(e -> e).average().getAsDouble();
        System.out.println(ave);
    }
}
