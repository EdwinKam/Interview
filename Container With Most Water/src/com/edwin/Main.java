package com.edwin;

import javax.swing.text.Highlighter;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Solution s = new Solution();
        System.out.println(s.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}
class Solution1 {
    public int maxArea(int[] height) {
        int start=0,end=0;
        int cs=0, ve=0;
        int high=0,low=0;
        for(int i=0; i<height.length;i++){
            if(height[i]>high){
                low=high;
                high=height[i];
            }else if(height[i]>low){
                low=height[i];
            }
        }
        for(int i=0; i< height.length;i++){
            int svalue=Math.min(height[i],low)+height.length-1-i;
            int evalue=Math.min(height[i],low)+i;
            if(svalue>cs){
                cs=svalue;
                start=i;
            }else if(evalue>ve){
                ve=evalue;
                end=i;
            }
        }
        return (end-start)*Math.min(height[start],height[end]);

    }
}
class Solution{
    public int maxArea(int[] height) {
        int size=0;
        int left=0, right=height.length-1;
        while(right>left){
            int current=Math.min(height[left],height[right])*(right-left);
            System.out.println(current);
            size=Math.max(size,current);
            if(height[right]<height[left]){
                right--;
            }else{
                left++;
            }
        }
        return size;
    }
}