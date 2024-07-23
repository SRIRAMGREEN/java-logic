package AjithCode;

import java.util.ArrayList;
import java.util.List;

public class Mock {
    public static void main(String[] args) {
        //happy number
        //take the squares of each didgit
        //add those squared numbers
        //if the added value is not=1 then again add those numbers until u get 1
        //or if the input value is repeated stop the flow.
        //if the op ==1 then it is happy number.

        int a = 222;
        List<Integer> numList = new ArrayList<>();
        int initial = a;
        int rem = 0;
        int sum1 = 0;
        int b = 0;
        while (a > 0) {
            rem = a % 10;
            a = a / 10;
            if (a > 9) {
                int rem1 = a % 10;
                int c = a / 10;
                sum1 = (c * c) + (rem1 * rem1)+(rem*rem);
                if (sum1 != 1) {
                    a = sum1;
                    numList.add(a);
                }

            } else {
                b = (a * a) + (rem * rem);
                if (b != 1) {
                    a = b;
                    numList.add(a);
                }
            }

        }
        for (int i = 0; i < numList.size(); i++) {
            if (numList.contains(b) || numList.contains(sum1)) {
                System.out.println(initial + " is not a happy number.");
                break;
            } else if (b == 1 || sum1 == 1) {
                System.out.println(initial + " is  a happy number.");
                break;
            }
        }

    }

}





