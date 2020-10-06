package com.edwin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Solution s = new Solution();
        System.out.println(s.threeSum(new int[]{0,0,0}));
    }
}
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result= new ArrayList<>();
        if(nums.length<3)return result;
        for(int i=0; i<nums.length-2;i++){
            if(i>0&&nums[i]==nums[i-1])continue;
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==0){
                    List<Integer> list=new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    result.add(list);
                    left++;
                    right--;
                    while(left<nums.length&&left-1>i&&nums[left-1]==nums[left]){
                        left++;
                    }
                    while (right>left&&right+1<nums.length-1&&(nums[right+1]==nums[right])){
                        right--;
                    }
                }else if(sum<0){
                    left++;
                }else right--;
            }
        }
        return result;
    }
}