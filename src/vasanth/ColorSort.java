package vasanth;

import java.util.Arrays;

public class ColorSort {
    public static void main(String[] args) {
        // 0 = red
        // 1 = white
        // 2 = blue
        // Sort the array without using the sort method
        // Output should be {0, 0, 1, 1, 2, 2}

        int[] num = {2, 0, 1, 0, 1, 2};
        sortColors(num);
        System.out.println(Arrays.toString(num));
    }

    public static void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else if (nums[mid] == 2) {
                swap(nums, mid, high);
                high--;
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
