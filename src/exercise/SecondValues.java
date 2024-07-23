package exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondValues {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(1,45,34,7,9,22,9,45);

        Integer num = numList.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).findFirst().get();
        System.out.println("second highest number using limit: "+num);

    Integer numL = numList.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
        System.out.println("second lowest number without using limit: "+numL);

        Integer SecondLowest = numList.stream().sorted().distinct().skip(1).findFirst().get();
        System.out.println("Second lowest number: "+SecondLowest);


    }
}
