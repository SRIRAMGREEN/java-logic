package AjithCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecPractice {
    public static void main(String[] args) {
//        method(5);
//         String word = "welcome";
//     int l =word.length()-1;
//        subString("welcome",l);


//    public static void method(int n) {
//        if (n == 0) {
//            System.out.println("done!!!");
//        } else {
//            System.out.println(n);
//            method(n -1);
//        }
//    }


//    public  static  void subString(String word,int l){
//        if (l==0){
//            System.out.println("done!!!");
//        }else {
//            System.out.println(word.charAt(l) );
//            l--;
//            subString(word,l);
//        }
//
//    }


        int[] number = { 5, 8, 10,1};
        Arrays.sort(number);

        int lastValue = number[number.length-1];
        List<Integer> numList = new ArrayList<>();
        int index=0;


        for (int i = 1; i <= lastValue; i++) {

            if (i == number[index]) {
                index++;
            }else {
                numList.add(i);
            }
        }

        System.out.println(numList);
//    missing numbers: 3,6,7,9;
//    int initial = 1;
//        List<Integer> numList = new ArrayList<>();
//
//    for(int num:number){
//        if(num==initial){
//            initial++;
//        }else{
//            numList.add(num);
//            initial++;
////            break;
//        }
//    }
//        System.out.println("missing number is: "+initial);
//        System.out.println("missing number List is: "+numList);
    }
}
