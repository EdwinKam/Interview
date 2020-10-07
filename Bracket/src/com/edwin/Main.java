package com.edwin;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Solution s = new Solution();
        System.out.println(s.isValid("[()"));
    }
}
class Solution {
    HashMap<Character,Integer> open= new HashMap<>();
    HashMap<Character,Integer> close= new HashMap<>();

    Solution(){
        open.put('{',1);
        open.put('(',2);
        open.put('[',3);
        close.put('}',1);
        close.put(')',2);
        close.put(']',3);

    }
    public boolean isValid(String s) {
        char[] list=new char[s.length()];
        int pointer =0;
        for(int i=0; i<s.length();i++){
            if(!open.containsKey(s.charAt(i))&&!close.containsKey(s.charAt(i))){
                System.out.println("1");
                return false;
            }
            list[pointer]=s.charAt(i);
            if(pointer>0&&close.containsKey(s.charAt(i))){
                if(equals(list[pointer-1],s.charAt(i))){
                    System.out.println(i);
                    pointer-=2;
                }else{
                    System.out.println("pointer"+pointer);
                    System.out.println("i"+i);
                    System.out.println("2");
                    return false;
                }
            }else if(pointer==0&&close.containsKey(s.charAt(i))){
                System.out.println("3");
                return false;
            }else{
                list[pointer]=s.charAt(i);
            }
            pointer++;
        }
        return (pointer==0);
    }
    private boolean equals(char open, char close){
        if(open=='('&&close==')')return true;
        if(open=='{'&&close=='}')return true;
        if(open=='['&&close==']')return true;
        return false;
    }
}