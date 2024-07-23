package PracticeCode;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {


        int a = 7;
        int i=1;
        int count = 0;

        while(i<=a){
            int c = a%i;
            if (c==0){
                count =count+1;
            }
            i++;

        }
        if(count>2){
            System.out.println("not prime");
        } else {
            System.out.println("prime");
        }
    }
}
