package com.edwin;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Solution s= new Solution();
        System.out.println(s.convert("a",1));
    }
}
class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1){
            return s;
        }
        int mark=(numRows-1)*2;
        int i=0;
        StringBuilder ret = new StringBuilder();
        for(int j=1;j<=numRows;j++){
            while(i<s.length()) {
                if(i+j-1<s.length())
                    ret.append(s.charAt(i+j-1));

                if(j!=1&&j!=numRows&&i+mark-j+1<s.length()){//try and if inside if might make it slower
                    ret.append(s.charAt(i+mark-j+1));
                }
                i+=mark;
            }
            i=0;
        }
        return ret.toString();

    }
}