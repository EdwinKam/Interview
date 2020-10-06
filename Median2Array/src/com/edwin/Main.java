package com.edwin;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Solution s = new Solution();
        int[]num1={};
        int[] num2 = {1};
        System.out.println(s.findMedianSortedArrays(num1,num2));
    }
}
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length+nums2.length;
        if(length==0){
            return 0.0;     //if both arrays have nothing in it
        }
        int oneCurrent=0, twoCurrent=0;     //declare two index for both array, these index will be inc
        if(length%2==1){//if length is odd
            for(int i =0; i<length/2;i++){//only need to run through half the array
                //we compare the first element of both array at the same time
                //then inc the smaller element index
                //in order to find the median of a set of numbers
                //we only need to find half of the numbers that are smaller than it
                if(twoCurrent==nums2.length){ //if we reach the end to nums2[], we inc nums1[] instead
                    oneCurrent++;
                }else if(oneCurrent==nums1.length) {
                    twoCurrent++;
                }else if(nums1[oneCurrent]<nums2[twoCurrent]){//find the min(nums1,nums2), then we inc the index
                    oneCurrent++;
                }else{
                    twoCurrent++;
                }
            }
            if(oneCurrent==nums1.length)
                return (double)nums2[twoCurrent];
            else if(twoCurrent==nums2.length)
                return (double)nums1[oneCurrent];
            return (double)Math.min(nums1[oneCurrent],nums2[twoCurrent]);
        }else{//if length==even
            for(int i =0; i<length/2-1;i++) {
                if (twoCurrent == nums2.length) {
                    oneCurrent++;
                } else if(oneCurrent==nums1.length) {
                    twoCurrent++;
                }else if (nums1[oneCurrent] < nums2[twoCurrent]) {
                    oneCurrent++;
                } else {
                    twoCurrent++;
                }
            }
            int first=0, second=0;      //we will have two median because this is an even number set,
            //we will return first+second/2
            if(twoCurrent==nums2.length){
                first=nums1[oneCurrent++];
            }else if(oneCurrent==nums1.length) {
                first=nums2[twoCurrent++];
            }else if(nums1[oneCurrent]<nums2[twoCurrent]){
                    first=nums1[oneCurrent++];
                }else{
                    first=nums2[twoCurrent++];
                }

            if(twoCurrent==nums2.length){
                second=nums1[oneCurrent++];
            }else if(oneCurrent==nums1.length) {
                second=nums2[twoCurrent++];
            }else if(nums1[oneCurrent]<nums2[twoCurrent]){
                second=nums1[oneCurrent++];
            }else{
                second=nums2[twoCurrent++];
            }
                return (double)(first+second)/2.0;

        }

    }
}
