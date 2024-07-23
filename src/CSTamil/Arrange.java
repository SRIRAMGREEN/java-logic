package CSTamil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Arrange {
    //an array has only 0 and 1. need to arrange 0s on left and 1s on right side.

    public static void main(String[] args) {
        int[] numbers = {1, 0, 0,1,1,0,1,0};
        int a = 0;
        int b = 1;

           List<Integer> numList = new LinkedList<>();

        for (int i = 0; i < numbers.length; i++) {
            if(!numList.contains(a)) {
                for (int j = i; j < numbers.length; j++) {
                    if (numbers[j]==a) {
                        numList.add(numbers[j]);
                    }

                }
            }if(numbers[i]==b) {
                numList.add(numbers[i]);
            }
        }
        System.out.println("array elements arranged in list"+numList);
//
    }
}
