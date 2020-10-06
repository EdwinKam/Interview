package com.edwin;

import java.security.spec.ECField;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Solution s= new Solution();
        System.out.println(s.reverse(1646324351));
    }
}
class Solution {
    public int reverse(int x) {
        boolean neg = x<0;
        if(neg){
            x=x*-1;
        }
        long result=0;
        while(x>0){
            result =result*10+(x%10);
            x/=10;

        }
        if(result>Integer.MAX_VALUE) return 0;
        if(neg){
            return -1*(int)result;
        }else{
            return (int)result;
        }
    }
}
