package vasanth;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static vasanth.FindTriplet.findTriplets;

public class Triplet {
    public static void main(String[] args) {
        int num[] ={2,7,4,0,9,5,1,3};
        int  target =6;


        findTriplets(num, target );



    }

    private static void findTriplets(int[] num, int target) {
        Arrays.sort(num);

        Set<String> foundTriplets = new HashSet<>();

        for (int i=0; i< num.length-2;i++){
            int left = i+1;
            int right = num.length-1;
            while(left<right){
                int sum = num[i]+num[left]+num[right];
                if (sum==target){
                    String triplet = "{"+num[i]+","+num[left]+","+num[right]+"}";

                if(!foundTriplets.contains(triplet)){
                    foundTriplets.add(triplet);
                    System.out.println(foundTriplets);

                }
                left++;
                right--;

            } else if (sum<target) {
                    left++;
                }else {
                    right--;
                }

                }
            }
    }
}
