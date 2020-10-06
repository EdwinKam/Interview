package com.edwin;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Solution s = new Solution();
        System.out.println(s.longestCommonPrefix(new String[] {"abc","ab"}));
    }
}
class Solution {
    public String longestCommonPrefix(String[] s) {
        //StringBuilder sb = new StringBuilder();
        int index=0;
        if(s.length==0)return "";
        while(true){
            for (int i=0; i<s.length;i++){
                if(index>=s[i].length()||(i-1>=0&&s[i].charAt(index)!=s[i-1].charAt(index))){
                    return s[0].substring(0,index);
                }
            }
            index++;
        }
    }
}