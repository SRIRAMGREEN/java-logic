package AjithCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SeparateNumbers {
    public static void main(String[] args) {

        int []numbers = {2,3,4,5,6,7,8,9};
        List<Integer> oddList = new ArrayList<>();
        List<Integer> evenList = new ArrayList<>();

        for (int num: numbers){
            int even = num %2 ;
            if (even==0){
                evenList.add(num);
            }else {
                oddList.add(num);
            }
        }
        Integer[] oddArray = oddList.toArray(new Integer[oddList.size()]);
        Integer[] evenArray = evenList.toArray(new Integer[evenList.size()]);
        System.out.println("evenList: "+evenList);
        System.out.println("oddList: "+oddList);

        System.out.println("OddArray:::: "+ Arrays.toString(oddArray));
        System.out.println("EvenArray:::: "+Arrays.toString(evenArray));



    }


}
