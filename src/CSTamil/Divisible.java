package CSTamil;

import java.util.Scanner;

public class Divisible {
    // get a number and check whether if it is divisible by both 3 and 5.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the whole number");
        int input = scanner.nextInt();
//        if ((input%3==0)&&(input%5==0)){
//            System.out.println("the given number is divisible by  both 3 and 5");
//        } else {
//            System.out.println("the number not divisible by 3 and 5");
//
//        }

        //ternary operator syntax===> (condition)?"yes":"no"

        String result = (input>5)?"true":"false";
        System.out.println(result);
    }
}
