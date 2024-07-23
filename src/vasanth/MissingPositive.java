package vasanth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingPositive {
    public static void main(String[] args) {
        int [] num ={-1,3,1,5};
        int a=0;
        int b=0;
        int missingNumber;
        List<Integer> numList = new ArrayList<>();
        Arrays.sort(num);
//        Integer miss = Arrays.stream(num)
        for (int n:num){
            if(n>b){
                b=a;
                a=n;
                if((a-1) ==(b+1)){
                    missingNumber=a-1;
                    numList.add(missingNumber);
                    System.out.println(numList);
                }
            }
        }
    }
}
