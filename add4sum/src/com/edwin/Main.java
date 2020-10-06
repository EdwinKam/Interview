package com.edwin;

import java.awt.image.ImageProducer;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Solution s = new Solution();
        System.out.println(s.fourSum(new int[]{1,0,-1,0,-2,2},0));
    }
}
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> result = new HashSet<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 3; i++) {
            int pointer = i + 1;
            int left = pointer + 1;
            int right = nums.length - 1;
            while (pointer < nums.length - 2) {
                int sum = nums[i] + nums[pointer] + nums[left] + nums[right];
                if (sum == target) {
                    result.add(Arrays.asList(nums[i], nums[pointer], nums[left], nums[right]));
                    left++;
                    right--;
                } else if (sum > target) {
                    right--;
                } else {
                    left++;
                }
                if (left >= right) {
                    pointer++;
                    left = pointer + 1;
                    right = nums.length - 1;
                }
            }
        }
        return new ArrayList<>(result);
    }
}