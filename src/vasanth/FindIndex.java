package vasanth;

import java.util.HashMap;
import java.util.Map;

public class FindIndex {
    public static void main(String[] args) {
        int target = 9;
        int[] nums = {3,2,4};
        FindIndex  solver= new FindIndex();
        int result[] = solver.findIndex(nums, target);

        //find the indexes which has numbers and their sum is the target.

        System.out.println(solver);
    }

    private int[] findIndex(int[] nums,int target) {


        Map<Integer,Integer> numMap = new HashMap<>();
        int n = nums.length;
        for (int i=0; i<n;i++){
            int compliment = target-nums[i];
            if(numMap.containsKey(compliment)){
                return new int[]{numMap.get(compliment),i};
            }
            numMap.put(nums[i],i);
        }
        return new int[] {};




//        for (int i=0; i< nums.length;i++){
//            for (int j=i+1;j< nums.length;j++){
//                int sum = i+j;
//                if(sum==target){
//                    System.out.println(i+","+j);
//                }
//            }
//
//        }

    }
}
