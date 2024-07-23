package vasanth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfThree {
    public static void main(String[] args) {
        List<List<Integer>> result = sumMethod(new int[]{-1, 0, 1, 2, -1, -4});
        System.out.println(result);
    }

    private static List<List<Integer>> sumMethod(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        // Sort the array to use the two-pointer technique
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            // Avoid duplicates
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Move the left and right pointers to the next different numbers to avoid duplicates
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }
}
























//=========================================================================================================

//import java.util.ArrayList;
//import java.util.List;

//public class SumOfThree {
//    public static void main(String[] args) {
//        sumMethod();
//    }
//
//    private static void sumMethod() {
//        int[] num = {-1,0,1,2,-1,-4};
////        Output: [[-1,-1,2],[-1,0,1]]
//        //(-1)+(-1)+2=0
//
//        List<Integer> numList = new ArrayList<>();
//
//        for (int i=0;i< num.length;i++) {
//            if (numList.size() < 3) {
//                numList.add(num[i]);
//            }
//        }
//               for (int n:numList){
//                   int sum = n+n+n;
//                   if (sum==0){
//                       System.out.println(numList);
//
//                   }
//               }
//            }
//
//
//        }


