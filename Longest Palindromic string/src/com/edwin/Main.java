package com.edwin;


import org.w3c.dom.ls.LSOutput;

import javax.sound.midi.Soundbank;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Solution s = new Solution();
        System.out.println(s.longestPalindrome("abbd"));
    }
}
class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==0)return"";
        int startIndex=0,endIndex=0;
        for(int i=0; i<s.length();i++){
            int odd=length(s,i,i);
            int even=length(s,i,i+1);
            int length=Math.max(odd,even);
            if(length>endIndex-startIndex){
                startIndex=i-(length-1)/2;
                endIndex=i+(length)/2;

            }
        }
        return s.substring(startIndex,endIndex+1);
    }
    private int length(String s, int left,int right){
        while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
                left--;
                right++;
           }
        return right-left-1;
    }
}