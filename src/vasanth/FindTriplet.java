package vasanth;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindTriplet {
    public static void main(String[] args) {
        int num[] ={2,7,4,0,9,5,1,3};
        int  target =6;
        List<Integer> numList = new LinkedList<>();

        //given unsorted integer array find triplet with a given sum.
        // num=[2,7,4,0,9,5,1,3]
        //target=6
        //ans: {0,1,5}{0,2,4},{1,2,3};

                findTriplets(num, target);
            }

            public static void findTriplets(int[] num, int target) {
                // Sort the array
                Arrays.sort(num);

                // Use a set to avoid duplicate triplets
                Set<String> foundTriplets = new HashSet<>();

                for (int i = 0; i < num.length - 2; i++) {
                    int left = i + 1;
                    int right = num.length - 1;

                    while (left < right) {
                        int sum = num[i] + num[left] + num[right];
                        if (sum == target) {
                            String triplet = "{" + num[i] + "," + num[left] + "," + num[right] + "}";
                            if (!foundTriplets.contains(triplet)) {
                                foundTriplets.add(triplet);
                                System.out.println(triplet);
                            }
                            left++;
                            right--;
                        } else if (sum < target) {
                            left++;
                        } else {
                            right--;
                        }
                    }
                }
            }
        }
