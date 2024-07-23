package AjithCode;

import java.util.ArrayList;
import java.util.List;

public class factorial {
    public static void main(String[] args) {
//        int a =5;
//        int fact=1;
//        for (int i=1;i<=a;i++){
//            fact=fact*i;
//        }
//        System.out.println(fact);



        int a = 20;
        List<Integer> numList = new ArrayList<>();
        int initial = a;
        int rem = 0;
        int sum1 = 0;
        int b = 0;

        while (true) {
            while (a > 0) {
                rem = a % 10;
                a = a / 10;

                if (a > 9) {
                    int rem1 = a % 10;
                    int c = a / 10;
                    sum1 = (c * c) + (rem1 * rem1);
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

            if (a == 1) {
                System.out.println(initial + " is a happy number.");
                break;
            } else if (numList.contains(a)) {
                System.out.println(initial + " is not a happy number.");
                break;
            }

            // Reset values for the next iteration
            a = b;
            numList.add(a);
        }
    }
}
