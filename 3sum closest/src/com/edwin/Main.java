package com.edwin;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans=nums[1]+nums[2]+nums[3];
        for(int i=0; i<nums.length-2;i++){
            int left=i+1;
            int right =nums.length-1;
            if(i>0&&nums[i]==nums[i-1])continue;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==target){
                    return sum;
                }
                if(Math.abs(target-sum)<Math.abs(target-ans)){
                    ans=sum;
                }
                if(sum>target){
                    right--;
                }else left++;
            }
        }
        return ans;
    }
}