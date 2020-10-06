package com.edwin;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Solution s = new Solution();
        System.out.println(s.isPalindrome(-1));
    }
}
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)return false;
        int another=0;
        int initial=x;
        while(x>0){
            another*=10;
            another=another+x%10;
            x/=10;
        }
        return(initial==another);
    }
}