package vasanth;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MergeArray {

        public static void main(String[] args){
            merge();
        }
        public static void merge(){
            int[] num1 ={1,2,3,0,0};
            int[] num2 = {2, 5, 6};
            Set<Integer> numSet = new TreeSet<>();

            for(int m : num1){
                if(m!=0) {
                    numSet.add(m);
                }
            }
            for (int n: num2){
                if(n!=0) {
                    numSet.add(n);
                }
            }
            System.out.println(numSet);
        }
//        public static void merge() {
//            int[] num1 ={1,2,3,0,0};
//            int[] num2 = {2,5,6};
////            int m = 3; int n=2;
//            Set<Integer> numSet =  new TreeSet<>();
//
//            for(int secondArray = 0; secondArray<num2.length; secondArray++){
//                for(int firstArray = 0; firstArray<num1.length; firstArray++){
//                    if(!numSet.contains(num1[firstArray] )&& num1[firstArray]!=0){
//                        numSet.add(num1[firstArray]);
//                    }
//
//                }
//                if(!numSet.contains(num2[secondArray])){
//                    numSet.add(num2[secondArray]);
//                }
//
//            }
//            System.out.println(numSet);
//
//        }
    }

