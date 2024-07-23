package AjithCode;

import java.util.ArrayList;
import java.util.List;

public class HappyNumber {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int initial = 13;
        int output=initial;

        int sum = 0;

        int rem = 0;
        int quo = 0;

        while (!list.contains(initial)) {
            list.add(initial);
            while (initial > 0) {
                rem = initial % 10;
                sum = (sum) + (rem * rem);
                quo = initial / 10;
                initial = quo;
            }
            initial = sum;
            sum = 0;
            if (initial == 1) {
                System.out.println("Its happy number");
                break;
            }
        }

        System.out.println(initial);
        System.out.println("Its not a happy number " + " "+output);

    }
}
