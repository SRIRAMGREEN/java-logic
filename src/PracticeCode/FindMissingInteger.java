package PracticeCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMissingInteger {
    public static void main(String[] args) {
        int[] numbers = {3,2,4,7};
        Arrays.sort(numbers);
        List<Integer> numList = new ArrayList<>();
        int lastDigit = numbers[numbers.length-1];
        System.out.println(lastDigit);
        int index=0;

        for (int i=1;i<lastDigit;i++){
            if (i==numbers[index]){
                index++;
            }else{
                numList.add(i);
            }
        }
        System.out.println(numList);
    }
}
