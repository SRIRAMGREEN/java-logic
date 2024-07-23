package vasanth;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int [] num = {2,3,5,6};
        int target = 7;

        List<Integer> numList = new ArrayList<>();

        // check any three combinations so that those should get the target value.
        //[2,2,3] ===> 2+2+3 = 7
        int a=0;

        for (int i=0; i<num.length;i++) {
            if (num[i] > a) {
                a = num[i];
                numList.add(a);
            }


                System.out.println(numList);
            int sum = a+num[i];
            System.out.println(sum);
            if(sum<target){
                if(a>num[i]){
                    a=a+a;
                    numList.add(a,num[i]);
                }
                System.out.println("after sum " +numList);
            }

            }
         }
        }

