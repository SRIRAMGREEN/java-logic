package AjithCode;

import java.util.Arrays;

public class ArraySwap {
    public static void main(String[] args) {
//        int []a = {2,6,5,7,9};
        int []a = {7,5,9,2,6,4};
        int []z = a;
        Arrays.sort(a);

        int b=a[0];
        int c= a[a.length-1];
        a[0]=c;
        a[a.length-1]=b;
        System.out.println("original array: "+Arrays.toString(z));
        System.out.println("Swapped Array: "+Arrays.toString(a));













//        int b =a[0];
//        int c =a[a.length-1];
//        a[0]=c;
//        a[a.length-1] =b;
//
//        System.out.println(Arrays.toString(a));
    }
}

