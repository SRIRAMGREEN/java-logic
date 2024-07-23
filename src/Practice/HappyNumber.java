package Practice;

import java.util.ArrayList;
import java.util.List;

public class HappyNumber {

    public static void main(String[] args) {
        List<Integer> numlist = new ArrayList<>();

        int a =13;
        int initial =a;

        int quo=0;
        int rem=0;

       int sum=0;

       while(!numlist.contains(a)) {
           numlist.add(a);
           while (a > 0) {

               rem = a % 10;
               sum = sum + (rem * rem);
               quo = a / 10;
               a = quo;
           }
           a = sum;
           sum = 0;
           if (a == 1) {
               System.out.println(initial + " --->it is a happy number");
               break;
           }
       }

            System.out.println(initial+ " --->it is not a happy number");
        }
    }

