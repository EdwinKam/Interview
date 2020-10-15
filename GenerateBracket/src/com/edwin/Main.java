package com.edwin;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        backtrack(list,"",0,0,n);
        return list;


    }
    void backtrack(List<String> list, String result, int open, int close, int max){
        if(result.length()==max*2){
            list.add(result);
            return;
        }
        if(open<max){
            backtrack(list,result+"(",open+1,close,max);
        }
        if(close<open){
            backtrack(list,result+")",open,close+1,max);
        }

    }
}