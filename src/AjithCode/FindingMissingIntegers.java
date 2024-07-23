package AjithCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindingMissingIntegers {
    public static void main(String[] args) {
        int[] numbers = {10,2,4,7};
        Arrays.sort(numbers);
        List<Integer> numList = new ArrayList<>();
        int finalValue = numbers[numbers.length-1];

        int index = 0;

       for (int i=1;i<finalValue;i++){
           if(i==numbers[index]){
               index++;
           }else{
               numList.add(i);
           }
        }
        System.out.println(numList);
    }
}
