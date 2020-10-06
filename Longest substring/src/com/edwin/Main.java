package com.edwin;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Solution s = new Solution();
        System.out.println(s.lengthOfLongestSubstring("1221"));
    }
}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        HashMap<String, Integer> map= new HashMap<String, Integer>();
        int longest=0, startpoint=-1,length=0;
        for(int i=0; i<s.length();i++){
            System.out.print(i);
            if(map.containsKey(String.valueOf(s.charAt(i)))) {
                if(map.get(String.valueOf(s.charAt(i)))>startpoint)
                startpoint = map.get(String.valueOf(s.charAt(i)));
                length=i-startpoint;
            }else{
                length++;
            }
            System.out.println("lemgth:" +length);
            if(longest<length){
                longest=length;
            }
            map.put(String.valueOf(s.charAt(i)),i);
        }

        if(longest==-1)
        return s.length();
        return  longest;

    }
}