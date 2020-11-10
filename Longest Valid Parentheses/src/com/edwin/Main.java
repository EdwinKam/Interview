package com.edwin;

import java.lang.module.ResolutionException;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static void main(String[] args) {
	// write your code here

    }
    public static int longestValidParentheses(String s) {
        int length=0;
        int max=0;
        Deque<Character> stack = new ArrayDeque<>();
        Deque<Integer> index = new ArrayDeque<>();
        index.push(-1);
        for(int i=0; i<s.length();i++){
            char newin = s.charAt(i);
            if(stack.isEmpty()&&newin==')'){
                length=0;
                stack.push(newin);
                index.push(i);
            }
            if(!stack.isEmpty()&&newin==')'&&stack.peek()=='('){
                stack.pop();
                index.pop();
                length=i-index.peek();

                max=Math.max(length,max);


            }else{
                stack.push(newin);
                index.push(i);
            }
        }
        return max;
    }
}
