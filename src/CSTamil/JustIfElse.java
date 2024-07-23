package CSTamil;

import java.util.Scanner;

public class JustIfElse {
    //write a program to get scholarchip if average income is >7000.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your income: ");
        int income = scanner.nextInt();

        if(income>=7000){
            System.out.println("You will get scholarship");
        }else{
            System.out.println("you need more income to get scholarship");
        }
    }
}
