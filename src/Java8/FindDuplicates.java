package Java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindDuplicates {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(1,3,7,32,4,67,89,4,5,1,3,32,99);
        List<Integer> duplicates = numList.stream().filter(getvalue-> Collections.frequency(numList,getvalue)>1).distinct().collect(Collectors.toList());
        System.out.println(duplicates);
    }
}
