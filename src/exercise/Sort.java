package exercise;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] arr = {0,1,0,1,0,0,1,1,1,0,1};

        int count1=0;
        int count0=0;

        for (int i=0;i< arr.length;i++){
            if (arr[i]==1){
              count1=count1+1;
            } else if (arr[i]==0) {
                count0=count0+1;
            }

        }

        System.out.println("1 count: "+count1);
        System.out.println("0 count: "+count0);
    }
}
